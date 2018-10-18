package items;

public class Familiar implements IDefend {

    FamiliarType type;

    public Familiar(FamiliarType type) {
        this.type = type;
    }

    public FamiliarType getType() {
        return type;
    }

    @Override
    public double getDefence() {
        return type.getDefence();
    }
}
