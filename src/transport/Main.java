package transport;

public class Main {
    public static void main(String[] args) {
        // Exercise 1,2,3
        Car car1 = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия", "механика", "хэчбэк", "C227HA48", 5, true, new Car.Key(true, true));
        Car car2 = new Car("Audi", "A8 50 l TDI quattro", 3.0f, "черный", 2020, "Германия", "автомат", "купэ", "C227HA48", 5, true, new Car.Key(true, true));
        Car car3 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия", "автомат", "хэчбэк", "C227HA48", 5, true, new Car.Key(true, true));
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Коррея", "автомат", "купэ", "C227HA48", 5, true, new Car.Key(true, true));
        Car car5 = new Car("Hyundai", "Avante", 1.6f, "оренжевый", 2016, "Южная Коррея", "автомат", "угиверсал", "C227HA48", 5, true, new Car.Key(true, true));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}