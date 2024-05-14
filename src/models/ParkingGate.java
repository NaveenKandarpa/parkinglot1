package models;

public class ParkingGate extends BaseModel{
    private ParkingStatus gateStatus;

    public ParkingStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(ParkingStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    private GateType gateType;
    private Operator operator;
}