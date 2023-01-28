package transport;

public enum BusType {
    Passenger,
    Special;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
