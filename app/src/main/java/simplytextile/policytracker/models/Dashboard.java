package simplytextile.policytracker.models;

import android.service.autofill.Dataset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Dashboard
{
    @SerializedName("sectionlist")
    @Expose
    private List<Object> sectionlist = null;
    @SerializedName("dataset")
    @Expose
    private List<Dataset> dataset = null;

    public List<Object> getSectionlist() {
        return sectionlist;
    }

    public void setSectionlist(List<Object> sectionlist) {
        this.sectionlist = sectionlist;
    }

    public List<Dataset> getDataset() {
        return dataset;
    }

    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }
}
