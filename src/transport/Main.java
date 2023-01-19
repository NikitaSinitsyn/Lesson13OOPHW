package transport;

public class Main {
    public static void main(String[] args) {
        // Exercise 1,2,3
        Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый", 200, 1.7f, "механика", "хэчбэк", "C227HA48", 5, true, new Car.Key(true, true));
        Car car2 = new Car("Audi", "A8 50 l TDI quattro", 2020, "Германия", "черный", 280, 3.0f, "автомат", "купэ", "C227HA48", 5, true, new Car.Key(true, true));
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 270, 3.0f, "автомат", "хэчбэк", "C227HA48", 5, true, new Car.Key(true, true));
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2015, "Южная Коррея", "красный", 260, 2.4f, "автомат", "купэ", "C227HA48", 5, true, new Car.Key(true, true));
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Коррея", "оренжевый", 260, 2.5f, "автомат", "угиверсал", "C227HA48", 5, true, new Car.Key(true, true));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        Bus firstBus = new Bus("Hyundai", "Universe", 2020, "Южная Коррея", "белый", 180);
        Bus secondBus = new Bus("Kia", "Granbird Silkroad", 2021, "Южная Коррея", "серый", 180);
        Bus thirdBus = new Bus("Volvo", "9900", 2022, "Швеция", "белый", 190);
        System.out.println(firstBus);
        System.out.println(secondBus);
        System.out.println(thirdBus);
    }
}