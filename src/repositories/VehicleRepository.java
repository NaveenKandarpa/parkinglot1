package repositories;

import models.ParkingGate;
import models.ParkingSpot;
import models.ParkingStatus;
import models.Vehicle;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {

    HashMap<Long, Vehicle> vehicles = new HashMap<>();

    public void saveData() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1L);
        vehicle.setVehicleNumber("KA-01-HH-1234");
        vehicles.put(vehicle.getId(), vehicle);
    }

    public Vehicle save(Vehicle vehicle) {
        return new Vehicle();
    }

    public Optional<Vehicle> findById(String vehicleNumber) {
        return Optional.of(vehicles.get(1L));
    }

}
