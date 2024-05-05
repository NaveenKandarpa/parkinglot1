package repositories;

import models.ParkingGate;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {
    HashMap<Long, ParkingGate> gates = new HashMap<Long, ParkingGate>();

    public ParkingGate save (ParkingGate gate) {
        return null;
    }

    public ParkingGate findGateById(Long id) {
        return null;
    }
}
