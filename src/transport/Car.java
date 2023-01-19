package transport;

import java.util.Objects;
import java.util.regex.Pattern;

import static transport.Validator.*;

public class Car extends Transport {

    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;


    public Car(String brand,
               String model,
               int year,
               String country,
               String colour,
               int maxSpeed,
               float engineVolume,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean isSummerRubber,
               Key key) {
        super(brand, model, year, country, colour, maxSpeed);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
        this.isSummerRubber = isSummerRubber;
        this.key = key;
    }

    public float getEngineVolume() {
        return engineVolume;
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

    public static float validateEngineVolume(float parameter) {
        return parameter <= 0 ? 1.5f : parameter;
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
                    "remoteStart = " + remoteStart +
                    ", keylessAccess = " + keylessAccess +
                    '}';
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Car " +
                "engineVolume = " + engineVolume +
                ", transmission = '" + transmission +
                ", bodyType = " + bodyType +
                ", registrationNumber = " + registrationNumber +
                ", numberOfSeats = " + numberOfSeats +
                ", isSummerRubber = " + isSummerRubber +
                ", key= " + key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && isSummerRubber == car.isSummerRubber && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, isSummerRubber, key);
    }
}
