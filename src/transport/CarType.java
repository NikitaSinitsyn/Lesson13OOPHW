package transport;

public enum CarType {
    ЧетыреътактныйСНадувом,
    ЧетырехтактныйБезНадува,
    ДвутактныйСНадувом,
    ДвутактныйБезНадува;

    @Override
    public String toString() {
        return "Тип транспортного средства: " + super.toString();
    }
}
