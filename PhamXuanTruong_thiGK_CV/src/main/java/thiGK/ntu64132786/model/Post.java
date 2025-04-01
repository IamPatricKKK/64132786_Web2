package thiGK.ntu64132786.model;

public class Post {
    private String id;
    private String title;
    private String categoryID;

    public Post() {}

    public Post(String id, String title, String categoryID) {
        this.id = id;
        this.title = title;
        this.categoryID = categoryID;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategoryID() { return categoryID; }
    public void setCategoryID(String categoryID) { this.categoryID = categoryID; }
}
