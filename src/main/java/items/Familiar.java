package items;

public class Familiar implements IDefend {

    FamiliarType type;

    public Familiar(FamiliarType type) {
        this.type = type;
    }

    @Override
    public double getDefence() {
        return type.getDefence();
    }
}
