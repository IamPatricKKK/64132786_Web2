package thiGK.ntu64132786.model;

public class Page {
	private Long id;
    private String pageName;
    private Long parentPageID;

    // Constructor không tham số
    public Page() {}

    // Constructor có tham số
    public Page(Long id, String pageName, Long parentPageID) {
        this.id = id;
        this.pageName = pageName;
        this.parentPageID = parentPageID;
    }

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPageName() { return pageName; }
    public void setPageName(String pageName) { this.pageName = pageName; }

    public Long getParentPageID() { return parentPageID; }
    public void setParentPageID(Long parentPageID) { this.parentPageID = parentPageID; }
}
