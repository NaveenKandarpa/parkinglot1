package models;

public class Payment extends BaseModel{
    private String referenceId;
    private PaymentType paymentType;
    private int amount;
    private PaymentStatus paymentStatus;
}
