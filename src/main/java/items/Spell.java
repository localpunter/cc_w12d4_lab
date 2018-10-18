package items;

public class Spell implements IAttack {
    SpellType type;

    public Spell(SpellType type) {
        this.type = type;
    }

    @Override
    public double getDamage() {
        return type.getDamage();
    }
}
