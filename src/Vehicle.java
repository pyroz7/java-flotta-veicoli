public class Vehicle {
    //ATTRIBUTI

    private String licensePlate;
    private int yearRegistration;

    //COSTRUTTORI

    public Vehicle(String licensePlate, int yearRegistration) {
        this.licensePlate = licensePlate;
        this.yearRegistration = yearRegistration;
    }

    //GETTER E SETTER

    public String getLicensePlate(){
        return licensePlate;
    }

    public int getYearRegistration() {
        return yearRegistration;
    }




}
