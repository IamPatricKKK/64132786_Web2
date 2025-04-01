package thiGK.ntu64132786.model;

public class Post {
    private int id;
    private String title;
    private String content;
    private int categoryID;

    // Constructor
    public Post(int id, String title, String content, int categoryID) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.categoryID = categoryID;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public int getCategoryID() { return categoryID; }
    public void setCategoryID(int categoryID) { this.categoryID = categoryID; }

    // ToString method
    @Override
    public String toString() {
        return "Post{id=" + id + ", title='" + title + "', content='" + content + "', categoryID=" + categoryID + "}";
    }
}
