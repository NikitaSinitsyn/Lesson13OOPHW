package transport;

public enum TruckType {
    OpenBody,
    ClosedBody;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
