package models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private ParkingGate gate;
    private ParkingSpot parkingSpot;
    private Date entryTime;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingGate getGate() {
        return gate;
    }

    public void setGate(ParkingGate gate) {
        this.gate = gate;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}