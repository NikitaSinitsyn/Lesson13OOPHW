package transport;

import Driver.Driver;
import Mechanic.Mechanic;
import MyExeptions.TransportException;

import java.util.ArrayList;
import java.util.Objects;

import static Validator.Validator.validateString;
public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String colour;
    private float engineVolume;
    private T driver;
     ArrayList<Mechanic> mechanicsList;

    public Transport(String brand, String model, int year, String country, String colour, float engineVolume, T driver) {
        this.brand = validateParameter(brand);
        this.model = validateParameter(model);
        this.year = validateYear(year);
        this.country = validateParameter(country);
        this.colour = validateColor(colour);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.driver = driver;
        this.mechanicsList = new ArrayList<>();
    }

    // Getters & Setters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }


    public float getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(float engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public void setColour(String colour) {
        this.colour = validateColor(colour);
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public ArrayList<Mechanic> getMechanicsList() {
        return mechanicsList;
    }

    // validate area
    public static String validateParameter(String parameter) {
        return validateString(parameter, "default");
    }

    public static String validateColor(String parameter) {
        return validateString(parameter, "белый");
    }

    public static int validateYear(int parameter) {
        return parameter <= 0 ? 2000 : parameter;
    }

    //public static int validateMaxSpeed(int parameter) {
    //    final int maxSpeed = 350;
    //    final int minSpeed = 0;
    //    boolean validSpeed = parameter >= minSpeed && parameter <= maxSpeed;
    //    if (validSpeed) {
    //        return parameter;
    //    } else {
    //        throw new RuntimeException("Invalid speed!");
    //    }
    //}
    public static float validateEngineVolume(float parameter) {
        return parameter <= 0 ? 1.5f : parameter;
    }
     abstract void startMoving();
    abstract void stopMoving();
    public abstract void printType();
    public abstract void passDiagnostic() throws TransportException;

    public void addMechanic(String name, String lastName, String company){
        mechanicsList.add(new Mechanic(name, lastName, company));
    }
    public void addMechanic(Mechanic mechanic){
        mechanicsList.add(mechanic);
    }
    public void removeMechanic(Mechanic mechanic){
        mechanicsList.remove(mechanic);
    }
    public void removeMechanic(int index){
        mechanicsList.remove(index);
    }
    public void printAllMechanics(){
        System.out.println("Список механников: " + getBrand() + " " + getModel() + " " + mechanicsList);
    }
    public void printTheDriverInformation(){
        System.out.println("Водитель транспортного средства - " + getDriver().getFullName());
    }


    @Override
    public String toString() {
        return "Transport " + brand + " " + model + ", " + year + " года выпуска, сборка - " + country +
                ", цвет кузова - " + colour + ", engine volume = " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return year == transport.year && Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(colour, transport.colour) && Objects.equals(driver, transport.driver) && Objects.equals(mechanicsList, transport.mechanicsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, colour, engineVolume, driver, mechanicsList);
    }
}
