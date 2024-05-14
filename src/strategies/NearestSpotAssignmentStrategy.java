package strategies;

import exceptions.SpotNotAvailableException;
import models.ParkingSpot;
import models.ParkingStatus;
import repositories.ParkingSpotRepository;

import java.util.HashMap;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    private ParkingSpotRepository parkingSpotRepository;

    public NearestSpotAssignmentStrategy(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Override
    public ParkingSpot assignSpot() {
        // get the nearest spot
        HashMap<Long, ParkingSpot> spots = parkingSpotRepository.findAllSlots();
        for(ParkingSpot spot : spots.values()) {
            if(spot.getParkingStatus().equals(ParkingStatus.AVAILABLE)) {
                return spot;
            }
        }

        // return the spot
        throw new SpotNotAvailableException("No slots available");
        // throw an exception if no slots are available
    }
}
