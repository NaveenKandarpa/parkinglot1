package strategies;

import models.ParkingSpot;
import repositories.ParkingSpotRepository;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    private ParkingSpotRepository parkingSpotRepository;

    public NearestSpotAssignmentStrategy(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Override
    public ParkingSpot assignSpot() {

        return null;
    }
}
