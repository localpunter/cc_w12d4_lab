package items;

public class Weapon implements IAttack, ILootable {
    WeaponType type;

    public Weapon(WeaponType type) {
        this.type = type;
    }

    public WeaponType getType() {
        return type;
    }

    @Override
    public int getDamage() {
        return type.getDamage();
    }
}
