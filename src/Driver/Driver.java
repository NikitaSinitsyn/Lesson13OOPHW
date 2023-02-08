package Driver;

public abstract class Driver {
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean getLicense;
    private int yearsOfExperience;

    public Driver(String firstName, String middleName, String lastName, boolean getLicense, int yearsOfExperience) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.getLicense = getLicense;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGetLicense() {
        return getLicense;
    }

    public void setGetLicense(boolean getLicense) {
        this.getLicense = getLicense;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void reFuel();
    public String getFullName(){
       return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
    }

    @Override
    public String toString() {
        return "Driver " + firstName + " " + middleName + " " + lastName + " " + getLicense + " " + yearsOfExperience;
    }
}
