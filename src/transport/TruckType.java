package transport;

public enum TruckType {
    СОткрытымКузовом,
    СЗакрытымКузовом;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
