package simplytextile.policytracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import simplytextile.policytracker.companyresponse.Address;

/**
 * Created by shmahe on 21-09-2018.
 */

public class AgentList
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("first_name")
    @Expose
    private String first_name;
    @SerializedName("last_name")
    @Expose
    private String last_name;
    @SerializedName("business_name")
    @Expose
    private String business_name;
    @SerializedName("status_id")
    @Expose
    private Integer status_id;
    @SerializedName("aadhar_number")
    @Expose
    private Object aadhar_number;
    @SerializedName("govt_id_number")
    @Expose
    private Object govt_id_number;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("last_updated")
    @Expose
    private String last_updated;
    @SerializedName("update_counter")
    @Expose
    private Integer update_counter;
    @SerializedName("notes")
    @Expose
    private String notes;
    //    @SerializedName("more")
//    @Expose
//    private More more;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("irdai_number")
    @Expose
    private Object irdai_number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Object getAadhar_number() {
        return aadhar_number;
    }

    public void setAadhar_number(Object aadhar_number) {
        this.aadhar_number = aadhar_number;
    }

    public Object getGovt_id_number() {
        return govt_id_number;
    }

    public void setGovt_id_number(Object govt_id_number) {
        this.govt_id_number = govt_id_number;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Integer getUpdate_counter() {
        return update_counter;
    }

    public void setUpdate_counter(Integer update_counter) {
        this.update_counter = update_counter;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object getIrdai_number() {
        return irdai_number;
    }

    public void setIrdai_number(Object irdai_number) {
        this.irdai_number = irdai_number;
    }
}
