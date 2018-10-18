package characters;

import items.Armour;
import items.Weapon;

public class Warrior extends Player {

    private WarriorType type;
    private Weapon weapon;
    private Armour armour;

    public Warrior(WarriorType type, Weapon weapon, Armour armour) {
        super(type.getHp(), type.getGold());
        this.type = type;
        this.weapon = weapon;
        this.armour = armour;
    }

    public WarriorType getType() {
        return type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void attack(Character character) {
        int charHp = character.getHp();
        double playerDefence = character.defence();
        int damage = weapon.getDamage() * playerDefence;
        character.setHp(charHp - damage);
    }

    @Override
    public double defence() {
        return armour.getDefence();
    }
}
