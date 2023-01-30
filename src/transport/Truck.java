package transport;

import Driver.DriverCategoryD;

import java.util.Objects;

public class Truck extends Transport<DriverCategoryD>{
    private Integer pitStopTime;
    private Integer bestCircleTime;
    private Integer bestMaxSpeed;
    LoadCapacity loadCapacity;
    TruckType truckType;

    public Truck(String brand,
                 String model,
                 int year,
                 String country,
                 String colour,
                 float engineVolume,
                 DriverCategoryD driver,
                 Integer pitStopTime,
                 Integer bestCircleTime,
                 Integer bestMaxSpeed,
                 LoadCapacity loadCapacity,
                 TruckType truckType) {
        super(brand, model, year, country, colour, engineVolume, driver);
        this.pitStopTime = pitStopTime;
        this.bestCircleTime = bestCircleTime;
        this.bestMaxSpeed = bestMaxSpeed;
        this.loadCapacity = loadCapacity;
        this.truckType = truckType;
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    @Override
    void startMoving() {
        System.out.println("Truck is moving!");
    }

    @Override
    void stopMoving() {
        System.out.println("Truck is stopped!");
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
        if(truckType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(truckType);
        }
    }

    @Override
    public void passDiagnostic() {
        System.out.println("Грузовой атомобиль прошел диагностику");
    }

    @Override
    public String toString() {
        return super.toString() + ", pitStopTime = " + pitStopTime +
                ", bestCircleTime = " + bestCircleTime +
                ", bestMaxSpeed = " + bestMaxSpeed +
                loadCapacity +
                ", " + getTruckType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(pitStopTime, truck.pitStopTime) && Objects.equals(bestCircleTime, truck.bestCircleTime) && Objects.equals(bestMaxSpeed, truck.bestMaxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, bestCircleTime, bestMaxSpeed);
    }
}
