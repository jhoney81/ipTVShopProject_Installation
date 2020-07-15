package ipTVShopProject;

public class VisitationAccepted extends AbstractEvent {

    private Long id;
    private Long engineerId;
    private String engineerName;
    private String visitationDate;
    private String visitCompleteDate;
    private Long orderId;
    private String status;

    public VisitationAccepted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(Long engineerId) {
        this.engineerId = engineerId;
    }
    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }
    public String getVisitationDate() {
        return visitationDate;
    }

    public void setVisitationDate(String visitationDate) {
        this.visitationDate = visitationDate;
    }
    public String getVisitCompleteDate() {
        return visitCompleteDate;
    }

    public void setVisitCompleteDate(String visitCompleteDate) {
        this.visitCompleteDate = visitCompleteDate;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
