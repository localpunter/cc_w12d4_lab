package items;

public enum FamiliarType {
    OWL(0.9),
    CAT(0.8),
    RAVEN(0.7);

    private final double defence;

    FamiliarType(double defence) {
        this.defence = defence;
    }

    public double getDefence() {
        return defence;
    }
}
