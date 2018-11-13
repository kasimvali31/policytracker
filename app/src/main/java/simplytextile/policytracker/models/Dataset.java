package simplytextile.policytracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Dataset
{
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("headerlist")
    @Expose
    private List<String> headerlist = null;
    @SerializedName("rowlist")
    @Expose
    private List<Rowlist> rowlist = null;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getHeaderlist() {
        return headerlist;
    }

    public void setHeaderlist(List<String> headerlist) {
        this.headerlist = headerlist;
    }

    public List<Rowlist> getRowlist() {
        return rowlist;
    }

    public void setRowlist(List<Rowlist> rowlist) {
        this.rowlist = rowlist;
    }
}
