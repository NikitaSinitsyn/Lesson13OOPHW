package Main;

import Driver.Driver;
import Driver.DriverCategoryB;
import Driver.DriverCategoryC;
import Driver.DriverCategoryD;
import Enums.*;
import Mechanic.Mechanic;
import MyExeptions.TransportException;
import ServiceStation.ServiceStation;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DriverCategoryB driverB1 = new DriverCategoryB("Иван", "Петров", "Иванов", true, 15);
        DriverCategoryB driverB2 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB3 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB4 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryB driverB5 = new DriverCategoryB("Иван", "Иванов", "Иванов", true, 15);

        DriverCategoryC driverC1 = new DriverCategoryC("Иван", "Сидоров", "Иванов", true, 15);
        DriverCategoryC driverC2 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryC driverC3 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryC driverC4 = new DriverCategoryC("Иван", "Иванов", "Иванов", true, 15);

        DriverCategoryD driverD1 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryD driverD2 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryD driverD3 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);
        DriverCategoryD driverD4 = new DriverCategoryD("Иван", "Иванов", "Иванов", true, 15);

        List<Driver> driverList = new ArrayList<>();
        driverList.add(driverB1);
        driverList.add(driverB2);
        driverList.add(driverB3);
        driverList.add(driverB4);
        driverList.add(driverB5);
        driverList.add(driverC1);
        driverList.add(driverC2);
        driverList.add(driverC3);
        driverList.add(driverC4);
        driverList.add(driverD1);
        driverList.add(driverD2);
        driverList.add(driverD3);
        driverList.add(driverD4);

        ArrayList<Mechanic> mechanicsList = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Valentin", "Zhivin", "Red Bull");
        Mechanic mechanic2 = new Mechanic("Svqtoslav", "Korshin", "Red Bull");
        mechanicsList.add(mechanic1);
        mechanicsList.add(mechanic2);
        Mechanic mechanic3 = new Mechanic("Ivan", "Katynin", "Honda");
        Mechanic mechanic4 = new Mechanic("Ilia", "Katynin", "Honda");
        mechanicsList.add(mechanic3);
        mechanicsList.add(mechanic4);


        Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7f, driverB1, "механика", BodyType.COUPE, "C227HA48", 5, true, new Car.Key(true, true), 45, 245, 240, CarType.FOURSTROKESUPERCHARGED);
        Car car2 = new Car("Audi", "A8 50 l TDI quattro", 2020, "Германия", "черный", 3.0f, driverB2, "автомат", BodyType.COUPE, "C227HA48", 5, true, new Car.Key(true, true), 52, 252, 230, CarType.FOURSTROKESUPERCHARGED);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f, driverB3, "автомат", BodyType.HATCHBACK, "C227HA48", 5, true, new Car.Key(true, true), 53, 235, 235, CarType.FOURSTROKESUPERCHARGED);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2015, "Южная Коррея", "красный", 2.4f, driverB4, "автомат", BodyType.COUPE, "C227HA48", 5, true, new Car.Key(true, true), 42, 247, 242, CarType.FOURSTROKESUPERCHARGED);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Коррея", "оренжевый", 2.5f, driverB5, "автомат", BodyType.WAGON, "C227HA48", 5, true, new Car.Key(true, true), 43, 245, 220, CarType.FOURSTROKESUPERCHARGED);

        Bus firstBus = new Bus("Hyundai", "Universe", 2020, "Южная Коррея", "белый", 4.2f, driverC1, 45, 238, 220, CapacityType.SMALL, BusType.PASSENGER);
        Bus secondBus = new Bus("Kia", "Granbird Silkroad", 2021, "Южная Коррея", "серый", 5.0f, driverC2, 42, 250, 210, CapacityType.MIDDLE, BusType.PASSENGER);
        Bus thirdBus = new Bus("Volvo", "9900", 2022, "Швеция", "белый", 5.3f, driverC3, 41, 242, 209, CapacityType.MIDDLE, BusType.PASSENGER);
        Bus fourthBus = new Bus("Mercedes-Benz", "Sprinter", 2006, "Германия", "Серый", 3.0f, driverC4, 44, 243, 214, CapacityType.BIG, BusType.PASSENGER);

        Truck firstTruck = new Truck("MAN", "TGX", 2020, "Германия", "Серый", 4.2f, driverD1, 45, 241, 218, LoadCapacity.N1, TruckType.CLOSEBODY);
        Truck secondTruck = new Truck("MAN", "TGS", 2021, "Германия", "Серый", 5.0f, driverD2, 42, 243, 215, LoadCapacity.N2, TruckType.CLOSEBODY);
        Truck thirdTruck = new Truck("Volvo", "FN16", 2020, "Швеция", "Серый", 5.2f, driverD3, 41, 245, 212, LoadCapacity.N1, TruckType.CLOSEBODY);
        Truck fourthTruck = new Truck("Hyundai", "Xcient", 2021, "Южная Коррея", "Серый", 4.0f, driverD4, 45, 246, 210, LoadCapacity.N3, TruckType.CLOSEBODY);


        List<Transport> transportList = new ArrayList<>();
        transportList.add(car1);
        transportList.add(car2);
        transportList.add(car3);
        transportList.add(car4);
        transportList.add(car5);
        transportList.add(firstBus);
        transportList.add(secondBus);
        transportList.add(thirdBus);
        transportList.add(fourthBus);
        transportList.add(firstTruck);
        transportList.add(secondTruck);
        transportList.add(thirdTruck);
        transportList.add(fourthTruck);

        car1.addMechanic(mechanic2);
        car1.addMechanic(mechanic1);
        car1.printTheDriverInformation();
        car1.printAllMechanics();
        firstBus.addMechanic(mechanic1);

        car2.addMechanic(mechanic3);
        car2.addMechanic(mechanic4);

        printAllTransportsInformation(transportList);



        printInformationForTheRace(car1);
        printInformationForTheRace(firstTruck);
        printInformationForTheRace(firstBus);
        //checkTransportForDiagnostic(car1, firstBus, firstTruck);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransport(car1);
        serviceStation.addTransport(car2);
        serviceStation.printAllTransports();
        serviceStation.doService();
        serviceStation.printAllTransports();

        System.out.println("-----------------------------------");

        Map<Transport, List<Mechanic>> transportAndMechanicMap = new HashMap<>();
        transportAndMechanicMap.put(car1, car1.getMechanicsList());
        transportAndMechanicMap.put(car2, car2.getMechanicsList());


        for (Map.Entry<Transport, List<Mechanic>> map: transportAndMechanicMap.entrySet()) {
            System.out.println("Transport - " + map.getKey() + ", Mechanics - " + map.getValue());
        }

        Set<Driver> driverSet = new LinkedHashSet();
        driverSet.add(driverB1);
        driverSet.add(driverC1);
        driverSet.add(driverD1);

        Iterator<Driver> iterator = driverSet.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println(driver);
        }


    }

    private static void printInformationForTheRace(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде!");
    }

    private static void checkTransportForDiagnostic(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostic();
            } catch (TransportException e) {
                System.err.println(e.getMessage());
            }

        }
    }
    private static void printAllTransportsInformation(List transportList){
        for (Object transport : transportList) {
            System.out.println(transport);
        }
    }

}