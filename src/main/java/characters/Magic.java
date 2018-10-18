package characters;

import items.Familiar;
import items.Spell;

public class Magic extends Player {

    private MagicType type;
    private Spell spell;
    private Familiar familiar;

    public Magic(MagicType type, Spell spell, Familiar familiar) {
        super(type.getHp(), type.getGold());
        this.type = type;
        this.spell = spell;
        this.familiar = familiar;
    }

    public MagicType getType() {
        return type;
    }
    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    public void attack(Character character) {
        int charHp = character.getHp();
        double playerDefence = character.defence();
        int damage = spell.getDamage() * playerDefence;
        character.setHp(charHp - damage);
    }

    @Override
    public double defence() {
        return familiar.getDefence();
    }
}
