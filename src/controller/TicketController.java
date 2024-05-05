package controller;

import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;
import models.Ticket;
import services.TicketService;

public class TicketController {
    public TicketService ticketService;
    public  TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto dto) {
        Ticket ticket = ticketService.generateTicket(dto.getVehicleNumber(),
                dto.getName(),
                dto.getVehicleType(),
                dto.getGateId());

        return IssueTicketResponseDto.from(ticket);
    }
}
