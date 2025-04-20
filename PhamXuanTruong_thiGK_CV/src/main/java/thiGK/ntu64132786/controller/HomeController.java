package thiGK.ntu64132786.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/page")

public class HomeController {
	@GetMapping("/")  // Trang chủ
    public String home() {
        return "index"; 
    }

	@GetMapping("/pages")
    public String pagelist() {
        return "pages"; 
    }

	@GetMapping("/posts")
    public String postlist() {
        return "posts"; 
    }
}
