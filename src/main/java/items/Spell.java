package items;

public class Spell implements IAttack {
    SpellType type;

    public Spell(SpellType type) {
        this.type = type;
    }

    public SpellType getType() {
        return type;
    }

    @Override
    public int getDamage() {
        return type.getDamage();
    }
}
