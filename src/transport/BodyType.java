package transport;

public enum BodyType {
    SEDAN,
    HATCHBACK,
    COUPE,
    WAGON,
    SUV,
    CROSSOVER,
    PICKUP,
    VAN,
    MINIVAN;

    @Override
    public String toString() {
        return "BodyType: " + super.toString();
    }
}
