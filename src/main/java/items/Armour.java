package items;

public class Armour implements IDefend, ILootable {

    ArmourType type;

    public Armour(ArmourType type) {
        this.type = type;
    }

    public ArmourType getType() {
        return type;
    }

    @Override
    public double getDefence() {
        return type.getDefence();
    }
}
