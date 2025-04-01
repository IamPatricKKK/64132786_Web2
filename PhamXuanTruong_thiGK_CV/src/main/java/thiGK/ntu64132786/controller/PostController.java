package thiGK.ntu64132786.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import thiGK.ntu64132786.model.Post;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/post")

public class PostController {
	private final List<Post> posts = new ArrayList<>();

    // Hiển thị danh sách Post
    @GetMapping("/list")
    public String listPosts(Model model) {
        model.addAttribute("posts", posts);
        return "post-list";
    }

    // Thêm mới Post
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("post", new Post());
        return "add-post";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post) {
        posts.add(post);
        return "redirect:/post/list";
    }

    // Sửa Post
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        for (Post p : posts) {
            if (p.getId().equals(id)) {
                model.addAttribute("post", p);
                return "edit-post";
            }
        }
        return "redirect:/post/list";
    }

    @PostMapping("/edit/{id}")
    public String updatePost(@PathVariable String id, @ModelAttribute Post post) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getId().equals(id)) {
                posts.set(i, post);
                break;
            }
        }
        return "redirect:/post/list";
    }

    // Xóa Post
    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable String id) {
        posts.removeIf(p -> p.getId().equals(id));
        return "redirect:/post/list";
    }
}
