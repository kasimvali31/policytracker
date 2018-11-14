package simplytextile.policytracker.dashboardresponse;

public class Parameterlist
{

    private Integer companyId;

    private Integer statusId;

    private Integer typeId;

    private String startDate;
    
    private String endDate;

    /**
     * No args constructor for use in serialization
     *
     */
    public Parameterlist() {
    }

    /**
     *
     * @param statusId
     * @param startDate
     * @param endDate
     * @param companyId
     * @param typeId
     */
    public Parameterlist(Integer companyId, Integer statusId, Integer typeId, String startDate, String endDate) {
        super();
        this.companyId = companyId;
        this.statusId = statusId;
        this.typeId = typeId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
