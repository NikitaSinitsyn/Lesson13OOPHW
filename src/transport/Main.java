package transport;

import Driver.DriverCategoryB;
import Driver.DriverCategoryC;
import Driver.DriverCategoryD;

public class Main {
    public static void main(String[] args) {
        DriverCategoryB driverB1 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB2 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB3 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB4 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB5 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);

        Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый",  1.7f, driverB1, "механика", BodyType.Купе, "C227HA48", 5, true, new Car.Key(true, true), 45, 245, 240, CarType.ЧетыреътактныйСНадувом);
        Car car2 = new Car("Audi", "A8 50 l TDI quattro", 2020, "Германия", "черный",  3.0f, driverB2, "автомат", BodyType.Купе, "C227HA48", 5, true, new Car.Key(true, true), 52, 252, 230, CarType.ЧетыреътактныйСНадувом);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный",  3.0f, driverB1, "автомат", BodyType.Хетчбэк, "C227HA48", 5, true, new Car.Key(true, true), 53, 235, 235, CarType.ЧетыреътактныйСНадувом);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2015, "Южная Коррея", "красный",  2.4f, driverB4, "автомат", BodyType.Купе, "C227HA48", 5, true, new Car.Key(true, true), 42, 247, 242, CarType.ЧетыреътактныйСНадувом);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Коррея", "оренжевый",  2.5f, driverB5, "автомат", BodyType.Универсал, "C227HA48", 5, true, new Car.Key(true, true), 43, 245, 220, CarType.ЧетыреътактныйСНадувом);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        DriverCategoryC driverC1 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryC driverC2 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryC driverC3 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryC driverC4 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);
        Bus firstBus = new Bus("Hyundai", "Universe", 2020, "Южная Коррея", "белый",  4.2f, driverC1, 45, 238, 220, CapacityType.ОсобоМалая, BusType.Пасажирский);
        Bus secondBus = new Bus("Kia", "Granbird Silkroad", 2021, "Южная Коррея", "серый", 5.0f, driverC2, 42, 250, 210, CapacityType.Малая, BusType.Пасажирский);
        Bus thirdBus = new Bus("Volvo", "9900", 2022, "Швеция", "белый",  5.3f, driverC3, 41, 242, 209, CapacityType.Средняя, BusType.Пасажирский);
        Bus fourthBus = new Bus("Mercedes-Benz", "Sprinter", 2006, "Германия", "Серый",  3.0f, driverC4, 44, 243, 214, CapacityType.Средняя, BusType.Пасажирский);
        System.out.println(firstBus);
        System.out.println(secondBus);
        System.out.println(thirdBus);
        System.out.println(fourthBus);

        DriverCategoryD driverD1 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryD driverD2 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryD driverD3 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryD driverD4 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        Truck firstTruck = new Truck("MAN", "TGX", 2020,"Германия", "Серый",  4.2f, driverD1, 45, 241, 218, LoadCapacity.N1, TruckType.СЗакрытымКузовом);
        Truck secondTruck = new Truck("MAN", "TGS", 2021,"Германия", "Серый",  5.0f, driverD2, 42, 243, 215, LoadCapacity.N2, TruckType.СЗакрытымКузовом );
        Truck thirdTruck = new Truck("Volvo", "FN16", 2020,"Швеция", "Серый",  5.2f, driverD3, 41, 245, 212, LoadCapacity.N1, TruckType.СЗакрытымКузовом );
        Truck fourthTruck = new Truck("Hyundai", "Xcient", 2021,"Южная Коррея", "Серый",  4.0f, driverD4, 45, 246, 210, LoadCapacity.N3, TruckType.СЗакрытымКузовом);
        System.out.println(firstTruck);
        System.out.println(secondTruck);
        System.out.println(thirdTruck);
        System.out.println(fourthTruck);

        printInformation(car1);
        printInformation(firstTruck);
        printInformation(firstBus);


    }
    private static void printInformation(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде!");
    }
}