import java.util.HashMap;
import java.util.Map;

public class Scene {
    private String description;
    private Map<String, Scene> exits;
    private String choiceA, choiceB, choiceC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC;
    private int XPA, XPB, XPC;

    public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.exits = new HashMap<>();
        this.choiceA = choiceA;
        this.nextSceneA = nextSceneA;
        this.damageA = damageA;
        this.XPA = XPA;
        this.choiceB = choiceB;
        this.nextSceneB = nextSceneB;
        this.damageB = damageB;
        this.XPB = XPB;
        this.choiceC = choiceC;
        this.nextSceneC = nextSceneC;
        this.damageC = damageC;
        this.XPC = XPC;
    }

    public void displayScene() {
        System.out.println(description);
        System.out.println("Pilihan A: " + choiceA);
        System.out.println("Pilihan B: " + choiceB);
        System.out.println("Pilihan C: " + choiceC);
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toLowerCase()) {
            case "a":
                player.takeDamage(damageA);
                player.addXP(XPA);
                return nextSceneA;
            case "b":
                player.takeDamage(damageB);
                player.addXP(XPB);
                return nextSceneB;
            case "c":
                player.takeDamage(damageC);
                player.addXP(XPC);
                return nextSceneC;
            default:
                return null;
        }
    }
}