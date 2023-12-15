import java.util.ArrayList;
import java.util.List;

public class VehicleManagement {
    private static List<Vehicle> management = new ArrayList<>();
    public static void addVehicle(Vehicle vehicle){
        management.add(vehicle);
    }

    public static int countsVehiclesByType(Class<?> tipeVehicle) {
        int count = 0;
        for (Vehicle vehicle : management) {
            if (tipeVehicle.isInstance(vehicle)) {
                count++;
            }
        }
        return count;
    }

    public static Vehicle searchVehicleForStand(String licenseplate) {
        for (Vehicle vehicle : management) {
            if (vehicle.getLicensePlate().equals(licenseplate)) {
                return vehicle;
            }
        }
        return null; // Vehicle not found
    }



}
