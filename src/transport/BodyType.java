package transport;

public enum BodyType {
    Седан,
    Хетчбэк,
    Купе,
    Универсал,
    Внедорожник,
    Кроссовер,
    Пикап,
    Фургон,
    Минивэн;

    @Override
    public String toString() {
        return "BodyType: " + super.toString();
    }
}
