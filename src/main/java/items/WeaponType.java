package items;

public enum WeaponType {
    SWORD(20),
    MACE(25),
    HAMMER(30);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
