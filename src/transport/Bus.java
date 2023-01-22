package transport;

import Driver.DriverCategoryC;

import java.util.Objects;

public class Bus extends Transport<DriverCategoryC>{
    private Integer pitStopTime;
    private Integer bestCircleTime;
    private Integer bestMaxSpeed;

    public Bus(String brand,
               String model,
               int year,
               String country,
               String colour,
               float engineVolume,
               DriverCategoryC driver,
               Integer pitStopTime,
               Integer bestCircleTime,
               Integer bestMaxSpeed) {
        super(brand, model, year, country, colour, engineVolume, driver);
        this.pitStopTime = pitStopTime;
        this.bestCircleTime = bestCircleTime;
        this.bestMaxSpeed = bestMaxSpeed;
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
    public String toString() {
        return super.toString() + ", pitStopTime=" + pitStopTime +
                ", bestCircleTime=" + bestCircleTime +
                ", bestMaxSpeed=" + bestMaxSpeed;
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
