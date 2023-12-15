
public class Main {
    public static void main(String[] args) {

        VehicleManagement vehicleManagement = new VehicleManagement();

        Car car = new Car("GL390MS", 2022, 4);
        Motorcycles motorcycles = new Motorcycles("NI111GA", 2021, true);

        VehicleManagement.addVehicle(car);
        VehicleManagement.addVehicle(motorcycles);

        System.out.println("Numbers of car: " + VehicleManagement.countsVehiclesByType(Car.class));
        System.out.println("Number of motorcycle: " + VehicleManagement.countsVehiclesByType(Motorcycles.class));

        String plateSearch = "AB123CD";
        Vehicle vehicleFound = VehicleManagement.searchVehicleForStand(plateSearch);
        if (vehicleFound != null) {
            System.out.println("Vehicle found : " + vehicleFound.getClass().getSimpleName());
        } else {
            System.out.println("Vehicle don't found with plate: " + plateSearch);
        }
    }
}