package transport;

public enum BodyType {
    Sedan,
    Hatchback,
    Coupe,
    Wagon,
    SUV,
    Crossover,
    Pickup,
    Van,
    Minivan;

    @Override
    public String toString() {
        return "BodyType: " + super.toString();
    }
}
