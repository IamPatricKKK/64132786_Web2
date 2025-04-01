package thiGK.ntu64132786.model;

public class Page {
    private String id;
    private String pageName;
    private String parentPageID;

    public Page() {}

    public Page(String id, String pageName, String parentPageID) {
        this.id = id;
        this.pageName = pageName;
        this.parentPageID = parentPageID;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPageName() { return pageName; }
    public void setPageName(String pageName) { this.pageName = pageName; }

    public String getParentPageID() { return parentPageID; }
    public void setParentPageID(String parentPageID) { this.parentPageID = parentPageID; }
}
