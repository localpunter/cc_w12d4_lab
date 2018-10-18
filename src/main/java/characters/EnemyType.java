package characters;

public enum EnemyType {
    TROLL(300, 100),
    ORC(90, 10);

    private final int hp;
    private final int gold;

    EnemyType(int hp, int gold) {
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
