package simplytextile.policytracker.dashboardresponse;

public class DashbordResonse
{

    private Integer statuscode;
    private String message;
    private Data data;

    /**
     * No args constructor for use in serialization
     *
     */
    public DashbordResonse()
    {
    }

    /**
     *
     * @param message
     * @param data
     * @param statuscode
     */
    public DashbordResonse(Integer statuscode, String message, Data data) {
        super();
        this.statuscode = statuscode;
        this.message = message;
        this.data = data;
    }

    public Integer getStatuscode()
    {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode)
    {
        this.statuscode = statuscode;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Data getData()
    {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
