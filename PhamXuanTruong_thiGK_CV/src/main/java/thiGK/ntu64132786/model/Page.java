package thiGK.ntu64132786.model;

public class Page {
	private String id;
    private String Pagename;
    private String parentPageID;

    public Page() {}

    public Page(String id, String Pagename, String parentPageID) {
        this.id = id;
        this.Pagename = Pagename;
        this.parentPageID = parentPageID;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPagename() { return Pagename; }
    public void setPagename(String Pagename) { this.Pagename = Pagename; }

    public String getParentPageID() { return parentPageID; }
    public void setParentPageID(String parentPageID) { this.parentPageID = parentPageID; }
}
