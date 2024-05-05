package repositories;

import models.Vehicle;

import javax.swing.text.html.Option;
import java.util.Optional;

public class VehicleRepository {

    public Vehicle save(Vehicle vehicle) {
        return new Vehicle();
    }

    public Optional<Vehicle> findById(String vehicleNumber) {
        return null;
    }

}
