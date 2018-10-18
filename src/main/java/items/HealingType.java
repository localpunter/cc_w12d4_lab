package items;

public enum HealingType {
    POTION(10),
    HERB(5);

    private final int hp;

    HealingType(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
}
