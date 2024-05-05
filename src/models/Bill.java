package models;

import strategies.FeeCalculationStrategy;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Ticket ticket;
    private int amount;
    private Date exitTime;
    private FeeCalculationStrategy feeCalculationStrategy;
    private BillStatus billStatus;
    private List<Payment> payments;
}