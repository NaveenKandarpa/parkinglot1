import controller.TicketController;
import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;
import models.VehicleType;
import repositories.GateRepository;
import repositories.ParkingSpotRepository;
import repositories.VehicleRepository;
import services.TicketService;
import strategies.NearestSpotAssignmentStrategy;
import strategies.SpotAssignmentStrategy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        gateRepository.saveData();
        vehicleRepository.saveData();
        parkingSpotRepository.saveData();
        SpotAssignmentStrategy spotAssignmentStrategy = new NearestSpotAssignmentStrategy(parkingSpotRepository);

        TicketService ticketService = new TicketService(vehicleRepository, spotAssignmentStrategy, gateRepository);

        IssueTicketRequestDto dto = new IssueTicketRequestDto();
        dto.setVehicleNumber("KA-01-HH-1234");
        dto.setName("John Doe");
        dto.setVehicleType(VehicleType.BIKE);
        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDto response = ticketController.issueTicket(dto);
        System.out.println(response);
    }
}
