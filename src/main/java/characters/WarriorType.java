package characters;

public enum WarriorType {
    BARBARIAN(90, 10),
    DWARF(50, 50),
    KNIGHT(75, 25);

    private final int hp;
    private final int gold;

    WarriorType(int hp, int gold) {
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
