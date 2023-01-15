package transport;

import java.util.Objects;
import java.util.regex.Pattern;

import static transport.Validator.*;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;


    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean isSummerRubber,
               Key key) {
        this.brand = validateParameter(brand);
        this.model = validateParameter(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateParameter(country);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
        this.isSummerRubber = isSummerRubber;
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void changeTyres(int month) {
        if (month < 1 || month > 12) {
            throw new IndexOutOfBoundsException("Invalid month!");
        } else {
            if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
                isSummerRubber = false;
            } else {
                isSummerRubber = true;
            }
        }
    }

    //Validators
    public static String validateParameter(String parameter) {
        return validateString(parameter, "default");
    }

    public static String validateColor(String parameter) {
        return validateString(parameter, "белый");
    }

    public static float validateEngineVolume(float parameter) {
        return parameter <= 0 ? 1.5f : parameter;
    }

    public static int validateYear(int parameter) {
        return parameter <= 0 ? 2000 : parameter;
    }

    public static String validateTransmission(String parameter) {
        return validateString(parameter, "автомат");
    }

    public static String validateBodyType(String parameter) {
        return validateString(parameter, "седан");
    }

    public static int validateNumberOfSeats(int parameter) {
        return parameter <= 0 ? 4 : parameter;
    }

    public static String validateRegistrationNumber(String parameter) {
        boolean isRegistrationNumberValid = stringNotNullOrEmpty(parameter) && Pattern.matches("[ABEKMHOPCTYX][0-9]{3}(?<!000)[ABEKMHOPCTYX]{2}[0-9]{2,3}", parameter);
        if (!isRegistrationNumberValid) {
            throw new RuntimeException("Invalid registration number");
        }
        return parameter;
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }


    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка - " + country +
                ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + "л." +
                ", трансмиссия " + transmission + ", тип кузова " + bodyType + ", регистрационный номер " + registrationNumber + ", колличество мест "
                + numberOfSeats + ", летняя резина " + isSummerRubber + ", ключь " + key +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }

}
