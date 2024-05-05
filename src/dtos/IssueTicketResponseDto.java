package dtos;

import models.ResponseStatus;
import models.Ticket;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public static IssueTicketResponseDto from(Ticket ticket) {
        IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();
        if(ticket == null) {
            issueTicketResponseDto.setResponseStatus(ResponseStatus.ERROR);
            return issueTicketResponseDto;
        }

        issueTicketResponseDto.setTicket(ticket);
        issueTicketResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        return issueTicketResponseDto;
    }
}
