package items;

public enum ArmourType {
    HIDE(0.9),
    LEATHER(0.8),
    STEEL(0.7);

    private final double defence;

    ArmourType(double defence) {
        this.defence = defence;
    }

    public double getDefence() {
        return defence;
    }
}

