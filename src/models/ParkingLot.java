package models;

import strategies.FeeCalculationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> allowedVehicleTypes;
    private FeeCalculationStrategy feeCalculationStrategy;
    private List<ParkingGate> gates;
    private ParkingStatus parkingLotStatus;
}