package transport;

public enum BusType {
    Пасажирский,
    Специальный;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
