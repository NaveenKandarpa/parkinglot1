package repositories;

import models.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {

    HashMap<Long, ParkingSpot> spots = new HashMap<>();

    public HashMap<Long, ParkingSpot> findAllSlots() {

        return spots;
    }

    public void addSlot() {
        spots.put(1L, new ParkingSpot());
    }
}
