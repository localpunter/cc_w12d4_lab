package characters;

public enum MagicType {
    WIZARD(50, 50),
    WARLOCK(50, 50);

    private final int hp;
    private final int gold;

    MagicType(int hp, int gold) {
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
