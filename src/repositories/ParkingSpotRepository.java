package repositories;

import models.ParkingGate;
import models.ParkingSpot;
import models.ParkingStatus;

import java.util.HashMap;

public class ParkingSpotRepository {

    HashMap<Long, ParkingSpot> spots = new HashMap<>();

    public void saveData() {
        ParkingSpot spot = new ParkingSpot();
        spot.setId(1L);
        spot.setParkingStatus(ParkingStatus.AVAILABLE);
        spots.put(spot.getId(), spot);
    }

    public HashMap<Long, ParkingSpot> findAllSlots() {

        return spots;
    }

    public void addSlot() {
        spots.put(1L, new ParkingSpot());
    }
}
