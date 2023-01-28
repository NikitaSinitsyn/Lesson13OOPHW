package transport;

public enum CarType {
    FourStrokeSupercharged,
    FourStrokeWithoutBoost,
    TwoStrokeSupercharged,
    TwoStrokeUnAspirated;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
