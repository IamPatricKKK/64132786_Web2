package thiGK.ntu64132786.model;

public class Post {
	private String id;
    private String Title;
    private String CategoryID;

    public Post() {}

    public Post(String id, String Title, String CategoryID) {
        this.id = id;
        this.Title = Title;
        this.CategoryID = CategoryID;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return Title; }
    public void setTitle(String Title) { this.Title = Title; }

    public String getCategoryID() { return CategoryID; }
    public void setCategoryID(String CategoryID) { this.CategoryID = CategoryID; }
}
