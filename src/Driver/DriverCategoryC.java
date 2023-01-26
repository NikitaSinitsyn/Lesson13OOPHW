package Driver;

public class DriverCategoryC extends Driver{
    public DriverCategoryC(String firstName, String middleName, String lastName, boolean getLicense, int yearsOfExperience) {
        super(firstName, middleName, lastName, getLicense, yearsOfExperience);
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель" + getFullName() + "начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель" + getFullName() + "закончил движение!");
    }

    @Override
    public void reFuel() {
        System.out.println("Водитель" + getFullName() + "Заправил машину");
    }
}
