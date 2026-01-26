package patterns.task9;


public abstract class RequisitionBase extends AbstractEntity {
    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;

    public RequisitionBase() {
    }

    public RequisitionBase(RequisitionBase requisition) {
        super(requisition);
        if (requisition.user != null) {
            this.user = requisition.user.clone();
        }
        this.name = requisition.name;
        this.mail = requisition.mail;
        this.utmMark = requisition.utmMark;
        this.webinarType = requisition.webinarType;
        this.promoCode = requisition.promoCode;
    }
}
