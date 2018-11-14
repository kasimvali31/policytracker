package simplytextile.policytracker.dashboardresponse;

public class Data
{
private Dashboard dashboard;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data()
    {
    }

    /**
     *
     * @param dashboard
     */
    public Data(Dashboard dashboard)
    {
        super();
        this.dashboard = dashboard;
    }

    public Dashboard getDashboard()
    {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard)
    {
        this.dashboard = dashboard;
    }



}
