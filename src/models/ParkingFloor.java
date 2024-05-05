package models;

import java.util.List;

public class ParkingFloor extends BaseModel{
//    private String name;
    private List<VehicleType> allowedVehicleTypes;
    private List<ParkingSpot> parkingSpots;
    private ParkingStatus parkingStatus;
}
