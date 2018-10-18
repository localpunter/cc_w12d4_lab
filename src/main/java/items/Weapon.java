package items;

public class Weapon implements IAttack {
    WeaponType type;

    public Weapon(WeaponType type) {
        this.type = type;
    }

    @Override
    public double getDamage() {
        return type.getDamage();
    }
}
