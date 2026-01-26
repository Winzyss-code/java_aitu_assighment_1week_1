package patterns.task9;

// CguRequisition.java
public class CguRequisition extends RequisitionWithPhone {
    public String requestedSubscriptionType;
    public String language;

    public CguRequisition() {
    }

    public CguRequisition(CguRequisition requisition) {
        super(requisition);
        this.requestedSubscriptionType = requisition.requestedSubscriptionType;
        this.language = requisition.language;
    }

    @Override
    public CguRequisition clone() {
        return new CguRequisition(this);
    }
}
