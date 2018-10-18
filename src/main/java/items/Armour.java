package items;

public class Armour implements IDefend {

    ArmourType type;

    public Armour(ArmourType type) {
        this.type = type;
    }

    @Override
    public double getDefence() {
        return type.getDefence();
    }
}
