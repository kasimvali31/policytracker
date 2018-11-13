package simplytextile.policytracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rowlist
{
    @SerializedName("parameterlist")
    @Expose
    private Parameterlist parameterlist;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("type_id")
    @Expose
    private Integer type_id;
    @SerializedName("NAME")
    @Expose
    private String NAME;
    @SerializedName("Y")
    @Expose
    private String Y;
    @SerializedName("Z")
    @Expose
    private Integer z;
    @SerializedName("X-NAME")
    @Expose
    private String xNAME;
    @SerializedName("Y-NAME")
    @Expose
    private String yNAME;
    @SerializedName("Z-NAME")
    @Expose
    private String zNAME;
    @SerializedName("description")
    @Expose
    private String description;

    public Parameterlist getParameterlist() {
        return parameterlist;
    }

    public void setParameterlist(Parameterlist parameterlist) {
        this.parameterlist = parameterlist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getY() {
        return Y;
    }

    public void setY(String y) {
        Y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public String getxNAME() {
        return xNAME;
    }

    public void setxNAME(String xNAME) {
        this.xNAME = xNAME;
    }

    public String getyNAME() {
        return yNAME;
    }

    public void setyNAME(String yNAME) {
        this.yNAME = yNAME;
    }

    public String getzNAME() {
        return zNAME;
    }

    public void setzNAME(String zNAME) {
        this.zNAME = zNAME;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
