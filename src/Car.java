class Car extends Vehicle {

    private int numberDoors;

    public Car(String licensePlate, int yearRegistration, int numberDoors) {
        super(licensePlate, yearRegistration);
        this.numberDoors = numberDoors;
    }

    public int getNumberDoors() {
        return numberDoors;
    }
}
