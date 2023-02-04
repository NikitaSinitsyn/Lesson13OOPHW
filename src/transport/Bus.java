package transport;

import Driver.DriverCategoryC;
import Enums.BusType;
import Enums.CapacityType;
import MyExeptions.TransportException;

import java.util.Objects;

public class Bus extends Transport<DriverCategoryC>{
    private Integer pitStopTime;
    private Integer bestCircleTime;
    private Integer bestMaxSpeed;
    CapacityType capacityType;
    BusType busType;

    public Bus(String brand,
               String model,
               int year,
               String country,
               String colour,
               float engineVolume,
               DriverCategoryC driver,
               Integer pitStopTime,
               Integer bestCircleTime,
               Integer bestMaxSpeed,
               CapacityType capacityType,
               BusType busType) {
        super(brand, model, year, country, colour, engineVolume, driver);
        this.pitStopTime = pitStopTime;
        this.bestCircleTime = bestCircleTime;
        this.bestMaxSpeed = bestMaxSpeed;
        this.capacityType = capacityType;
        this.busType = busType;
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

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    @Override
    void startMoving() {
        System.out.println("Bus is moving!");
    }

    @Override
    void stopMoving() {
        System.out.println("Bus is stopped!");
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
        if(busType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(busType);
        }
    }

    @Override
    public void passDiagnostic() throws TransportException {
        throw new TransportException("Автобусы не должны проходить диагностику!");
    }


    @Override
    public String toString() {
        return super.toString() + ", pitStopTime = " + pitStopTime +
                ", bestCircleTime = " + bestCircleTime +
                ", bestMaxSpeed = " + bestMaxSpeed +
                ", " + capacityType +
                ", " + getBusType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Objects.equals(pitStopTime, bus.pitStopTime) && Objects.equals(bestCircleTime, bus.bestCircleTime) && Objects.equals(bestMaxSpeed, bus.bestMaxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, bestCircleTime, bestMaxSpeed);
    }
}

