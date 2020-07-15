
package ipTVShopProject;

public class VisitationCompleted extends AbstractEvent {

    private Long id;
    private Long EngineerId;
    private String EngineerName;
    private String VisitationDate;
    private String VisitCompleteDate;
    private Long OrderId;
    private String Status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getEngineerId() {
        return EngineerId;
    }

    public void setEngineerId(Long EngineerId) {
        this.EngineerId = EngineerId;
    }
    public String getEngineerName() {
        return EngineerName;
    }

    public void setEngineerName(String EngineerName) {
        this.EngineerName = EngineerName;
    }
    public String getVisitationDate() {
        return VisitationDate;
    }

    public void setVisitationDate(String VisitationDate) {
        this.VisitationDate = VisitationDate;
    }
    public String getVisitCompleteDate() {
        return VisitCompleteDate;
    }

    public void setVisitCompleteDate(String VisitCompleteDate) {
        this.VisitCompleteDate = VisitCompleteDate;
    }
    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
