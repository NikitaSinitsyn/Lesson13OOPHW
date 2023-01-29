package transport;

public enum CarType {
    FOURSTROKESUPERCHARGED,
    FOURSSTROKEWITHOUTBOOST,
    TWOSTROKESUPERCHARGED,
    TwoSTROKEUNASPIRATED;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
