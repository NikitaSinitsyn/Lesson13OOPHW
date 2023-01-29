package transport;

public enum TruckType {
    OPENBODY,
    CLOSEBODY;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
