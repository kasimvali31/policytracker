package simplytextile.policytracker.dashboardresponse;

public class Rowlist
{

    private Parameterlist parameterlist;

    private Integer id;

    private String name;

    private Integer count;

    private Integer typeId;

    private String nAME;

    private String y;

    private Integer z;

    private String xNAME;

    private String yNAME;

    private String zNAME;

    private String description;

    /**
     * No args constructor for use in serialization
     *
     */
    public Rowlist() {
    }

    /**
     *
     * @param id
     * @param parameterlist
     * @param count
     * @param description
     * @param yNAME
     * @param name
     * @param zNAME
     * @param nAME
     * @param z
     * @param typeId
     * @param y
     * @param xNAME
     */
    public Rowlist(Parameterlist parameterlist, Integer id, String name, Integer count, Integer typeId, String nAME, String y, Integer z, String xNAME, String yNAME, String zNAME, String description) {
        super();
        this.parameterlist = parameterlist;
        this.id = id;
        this.name = name;
        this.count = count;
        this.typeId = typeId;
        this.nAME = nAME;
        this.y = y;
        this.z = z;
        this.xNAME = xNAME;
        this.yNAME = yNAME;
        this.zNAME = zNAME;
        this.description = description;
    }

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getNAME() {
        return nAME;
    }

    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public String getXNAME() {
        return xNAME;
    }

    public void setXNAME(String xNAME) {
        this.xNAME = xNAME;
    }

    public String getYNAME() {
        return yNAME;
    }

    public void setYNAME(String yNAME) {
        this.yNAME = yNAME;
    }

    public String getZNAME() {
        return zNAME;
    }

    public void setZNAME(String zNAME) {
        this.zNAME = zNAME;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
