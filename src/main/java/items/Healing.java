package items;

public class Healing implements IHeal, ILootable {
    HealingType type;

    public Healing(HealingType type) {
        this.type = type;
    }

    public HealingType getType() {
        return type;
    }

    @Override
    public int getHp() {
        return type.getHp();
    }
}
