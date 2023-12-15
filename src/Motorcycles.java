class Motorcycles extends Vehicle{

    private boolean motorcycleStand;


    public Motorcycles(String licensePlate, int yearRegistration, boolean motorcycleStand) {
        super(licensePlate, yearRegistration);
        this.motorcycleStand = motorcycleStand;
    }

    public boolean havemotorcyleStand(){
        return motorcycleStand;
    }
}
