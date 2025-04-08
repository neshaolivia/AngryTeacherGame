import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        play();
    }

    public void play() {
        Scene currentScene = startScene;

        while (currentScene != null) {
            currentScene.displayScene();
            System.out.print("Masukkan pilihan (A/B/C) atau 'INFO' untuk melihat status: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("INFO")) {
                System.out.println("Health: " + player.getHealth() + ", XP: " + player.getXP());
            } else {
                currentScene = currentScene.makeChoice(choice, player);
                if (player.getHealth() <= 0) {
                    System.out.println("Game Over! Karakter Anda telah kalah.");
                    break;
                }
            }
        }
        scanner.close();
    }
}