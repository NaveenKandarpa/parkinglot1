package repositories;

import models.ParkingGate;
import models.ParkingSpot;
import models.ParkingStatus;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {
    HashMap<Long, ParkingGate> gates = new HashMap<Long, ParkingGate>();
    public void saveData() {
        ParkingGate gate1 = new ParkingGate();
        gate1.setId(1L);
        gate1.setGateStatus(ParkingStatus.AVAILABLE);
        gates.put(gate1.getId(), gate1);
    }

    public ParkingGate save (ParkingGate gate) {
        return null;
    }

    public ParkingGate findGateById(Long id) {
        return null;
    }
}
