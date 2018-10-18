package items;

public enum SpellType {
    FIREBALL(20),
    ICESPEAR(25),
    LIGHTNINGBOLT(30);

    private final int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
