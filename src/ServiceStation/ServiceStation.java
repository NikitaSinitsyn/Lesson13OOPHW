package ServiceStation;

import transport.Bus;
import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    Queue<Transport> serviceStation = new LinkedList<>();

    public void addTransport(Transport transport) {
        if (transport.getClass() == Bus.class) {
            System.out.println("Автобусы не могут проходить обслуживание!");
        } else if (serviceStation.contains(transport)) {
            System.out.println("Транспорт уже в очереди на техобслуживание");
        } else {
            serviceStation.add(transport);
            System.out.println("Транспрт добавлен в очередь на техобслуживание");
        }
    }

    public void doService() {
        if (serviceStation.isEmpty()) {
            System.out.println("Станция техобслуживания пуста!");
        } else {
            System.out.println(serviceStation.peek().getBrand() + " " + serviceStation.peek().getModel() + " прошла техобслуживание");
            serviceStation.poll().getBrand();
        }
    }

    public void printAllTransports() {
        if (serviceStation.isEmpty()) {
            System.out.println("Станция техобслуживания пуста!");
        } else {
            System.out.println(serviceStation);
        }
    }

}


