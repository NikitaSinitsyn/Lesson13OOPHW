package Mechanic;

public class Mechanic {
    private String firstName;
    private String lastName;
    private String companyName;

    public Mechanic(String firstName, String lastName, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void carryOutMaintenance(){
        System.out.println("Провел техническое обслуживание!");
    }
    public void fixTheCar(){
        System.out.println("Починил машину!");
    }

    @Override
    public String toString() {
        return firstName +  " " + lastName + " " + companyName;
    }
}
