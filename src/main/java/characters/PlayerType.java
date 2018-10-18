package characters;

public enum PlayerType {
    BARBARIAN(90, 10),
    DWARF(50, 50),
    KNIGHT(75, 25),
    WIZARD(50, 50),
    WARLOCK(50, 50),
    CLERIC(50, 50);

    private final int hp;
    private final int gold;

    PlayerType(int hp, int gold) {
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
