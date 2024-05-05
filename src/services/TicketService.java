package services;

import models.*;
import repositories.GateRepository;
import repositories.VehicleRepository;
import strategies.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private VehicleRepository vehicleRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private GateRepository gateRepository;

    public TicketService(VehicleRepository vehicleRepository,
                         SpotAssignmentStrategy spotAssignmentStrategy,
                         GateRepository gateRepository) {
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.gateRepository = gateRepository;
    }

    public Ticket generateTicket(String vehicleNumber, String ownerName, VehicleType vehicleType, Long gateId) {
        // assign the vehicle
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(vehicleNumber);
        Vehicle vehicle;
        if(optionalVehicle.isEmpty()) {
            vehicle = new Vehicle();
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            Vehicle savedVehicle = vehicleRepository.save(vehicle);
        }
        else {
            vehicle = optionalVehicle.get();
        }
        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);

        ticket.setEntryTime(new Date());

        // assign a spot
        ParkingSpot spot = spotAssignmentStrategy.assignSpot();
        ticket.setParkingSpot(spot);

        // assign a Gate
        ParkingGate parkingGate = gateRepository.findGateById(gateId);
        ticket.setGate(parkingGate);
        return ticket;
    }
}
