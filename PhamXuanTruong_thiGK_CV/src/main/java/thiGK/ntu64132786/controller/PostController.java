package thiGK.ntu64132786.controller;

import thiGK.ntu64132786.model.Post;
import thiGK.ntu64132786.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

	private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public String listPosts(Model model) {
        model.addAttribute("posts", postRepository.getAllPosts());
        return "posts";
    }
    
    @GetMapping("/view/{id}")
    public String viewPostDetails(@PathVariable String id, Model model) {
        for (Post p : postRepository.getAllPosts()) {
            if (p.getId().equals(id)) {
                model.addAttribute("post", p);
                return "view-post";
            }
        }
        return "redirect:/posts";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("post", new Post());
        return "add-post";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post) {
    	postRepository.addPost(post);
        return "redirect:/posts";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        for (Post s : postRepository.getAllPosts()) {
            if (s.getId().equals(id)) {
                model.addAttribute("post", s);
                return "edit-post";
            }
        }
        return "redirect:/posts";
    }

    @PostMapping("/edit/{id}")
    public String updatePost(@PathVariable String id, @ModelAttribute Post post) {
    	postRepository.updatePost(id, post);
        return "redirect:/posts";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable String id) {
    	postRepository.deletePost(id);
        return "redirect:/posts";
    }
}

