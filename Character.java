public class Character {
    private String name;
    private int health;
    private int XP;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void addXP(int additionalXP) {
        XP += additionalXP;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getXP() {
        return XP;
    }
}