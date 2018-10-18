package characters;

import items.Healing;

public class Healer extends Player {

    HealerType type;
    Healing item;

    public Healer(HealerType type, Healing item) {
        super(type.getHp(), type.getGold());
        this.type = type;
        this.item = item;
    }

    public HealerType getType() {
        return type;
    }

    public Healing getItem() {
        return item;
    }

    public void setItem(Healing item) {
        this.item = item;
    }

    public void attack(Character character) {
        int charHp = character.getHp();
        int healAmount = item.getHp();
        character.setHp(charHp + healAmount);
    }

    @Override
    public double defence() {
        return 1.0;
    }
}
