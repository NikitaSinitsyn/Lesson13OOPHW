package transport;

public enum BusType {
    PASSENGER,
    SPECIAL;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
