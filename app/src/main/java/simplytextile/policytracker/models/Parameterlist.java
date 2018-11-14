package simplytextile.policytracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameterlist
{

    @SerializedName("company_id")
    @Expose
    private Integer company_id;
    @SerializedName("status_id")
    @Expose
    private Integer status_id;
    @SerializedName("type_id")
    @Expose
    private Integer type_id;

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    @SerializedName("start_date")
    @Expose

    private String start_date;
    @SerializedName("end_date")
    @Expose
    private String end_date;
}
