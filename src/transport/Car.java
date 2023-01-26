package transport;
import Driver.DriverCategoryB;

import java.util.Objects;
import java.util.regex.Pattern;

import static Validator.Validator.*;

public class Car extends Transport<DriverCategoryB> {

    private String transmission;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;
    private Integer pitStopTime;
    private Integer bestCircleTime;
    private Integer bestMaxSpeed;
    BodyType bodyType;
    CarType carType;

    public Car(String brand,
               String model,
               int year,
               String country,
               String colour,
               float engineVolume,
               DriverCategoryB driver,
               String transmission,
               BodyType bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean isSummerRubber,
               Key key, Integer pitStopTime,
               Integer bestCircleTime,
               Integer bestMaxSpeed,
               CarType carType) {
        super(brand, model, year, country, colour, engineVolume, driver);
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.isSummerRubber = isSummerRubber;
        this.key = key;
        this.pitStopTime = pitStopTime;
        this.bestCircleTime = bestCircleTime;
        this.bestMaxSpeed = bestMaxSpeed;
        this.carType = carType;
    }

    public String getTransmission() {
        return transmission;
    }

    public BodyType getBodyType() {
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

    public Integer getPitStopTime() {
        return pitStopTime;
    }

    public void setPitStopTime(Integer pitStopTime) {
        this.pitStopTime = pitStopTime;
    }

    public Integer getBestCircleTime() {
        return bestCircleTime;
    }

    public void setBestCircleTime(Integer bestCircleTime) {
        this.bestCircleTime = bestCircleTime;
    }

    public Integer getBestMaxSpeed() {
        return bestMaxSpeed;
    }

    public void setBestMaxSpeed(Integer bestMaxSpeed) {
        this.bestMaxSpeed = bestMaxSpeed;
    }

    public Key getKey() {
        return key;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
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

    @Override
    void startMoving() {
        System.out.println("Car is moving!");
    }

    @Override
    void stopMoving() {
        System.out.println("Car is stopped!");
    }
    @Override
    public void getPitStop() {
        System.out.println("Pit Stop time is - " + getPitStopTime());
    }

    @Override
    public void getTheBestCircleTime() {
        System.out.println("The best circle time is - " + getBestCircleTime());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Max speed - " + getBestMaxSpeed());
    }

    @Override
    public void printType() {
        if(carType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(carType);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Car " +
                " transmission = '" + transmission +
                ", bodyType = " + bodyType +
                ", registrationNumber = " + registrationNumber +
                ", numberOfSeats = " + numberOfSeats +
                ", isSummerRubber = " + isSummerRubber +
                ", key = " + key +
                ", pitStopTime = " + pitStopTime +
                ", bestCircleTime = " + bestCircleTime +
                ", bestMaxSpeed = " + bestMaxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfSeats == car.numberOfSeats && isSummerRubber == car.isSummerRubber && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transmission, bodyType, registrationNumber, numberOfSeats, isSummerRubber, key);
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
}
