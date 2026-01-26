package patterns.task9;

// RequisitionWithPhone.java
public abstract class RequisitionWithPhone extends RequisitionBase {
    public String phone;

    public RequisitionWithPhone() {
    }

    public RequisitionWithPhone(RequisitionWithPhone requisition) {
        super(requisition);
        this.phone = requisition.phone;
    }
}
