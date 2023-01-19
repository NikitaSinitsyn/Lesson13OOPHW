package transport;

import java.util.Objects;

import static transport.Validator.validateString;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String colour;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String colour, int maxSpeed) {
        this.brand = validateParameter(brand);
        this.model = validateParameter(model);
        this.year = validateYear(year);
        this.country = validateParameter(country);
        this.colour = validateColor(colour);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColour(String colour) {
        this.colour = validateColor(colour);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validateMaxSpeed(maxSpeed);
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

    public static int validateMaxSpeed(int parameter) {
        final int maxSpeed = 350;
        final int minSpeed = 0;
        boolean validSpeed = parameter >= minSpeed && parameter <= maxSpeed;
        if (validSpeed) {
            return parameter;
        } else {
            throw new RuntimeException("Invalid speed!");
        }
    }

    @Override
    public String toString() {
        return "Transport " + brand + " " + model + ", " + year + " года выпуска, сборка - " + country +
                ", цвет кузова - " + colour + ", maxSpeed = " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(colour, transport.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, colour, maxSpeed);
    }
}
