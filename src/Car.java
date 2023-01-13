import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (this.model == "" || this.model == null) {
            this.model = "default";
        }
        if (this.brand == "" || this.brand == null) {
            this.brand = "default";
        }
        if (this.country == "" || this.country == null) {
            this.country = "default";
        }
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5f;
        }
        if (this.color == "" || this.color == null) {
            this.color = "белый";
        }
        if (this.year <= 0) {
            this.year = 2000;
        }

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

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка - " + country +
                ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + "л.";
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
