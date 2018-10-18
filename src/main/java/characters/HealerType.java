package characters;

public enum HealerType {
    CLERIC(50, 50);

    private final int hp;
    private final int gold;

    HealerType(int hp, int gold) {
        this.hp = hp;
        this.gold = gold;
    }

    public int getHp() {
        return hp;
    }

    public int getGold() {
        return gold;
    }
}
