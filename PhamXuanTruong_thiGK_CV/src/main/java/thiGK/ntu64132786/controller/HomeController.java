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

	@GetMapping("/pagelist")
    public String pagelist() {
        return "pagelist"; 
    }

//    @GetMapping("/list")  // Trang List
//    public String list() {
//        return "list"; 
//    }
}
