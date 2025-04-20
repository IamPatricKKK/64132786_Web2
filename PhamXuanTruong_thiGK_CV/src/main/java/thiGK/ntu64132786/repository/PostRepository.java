package thiGK.ntu64132786.repository;

import thiGK.ntu64132786.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    private final List<Post> posts = new ArrayList<>();

    public List<Post> getAllPosts() {
        return posts;
    }

    public void addPost(Post post) {
    	posts.add(post);
    }

    public void updatePost(String id, Post updatedPost) {
        for (Post s : posts) {
            if (s.getId().equals(id)) {
                s.setTitle(updatedPost.getTitle());
                s.setCategoryID(updatedPost.getCategoryID());
                return;
            }
        }
    }

    public void deletePost(String id) {
        posts.removeIf(s -> s.getId().equals(id));
    }
}
