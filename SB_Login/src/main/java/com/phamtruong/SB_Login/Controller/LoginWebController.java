package com.phamtruong.SB_Login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // <-- Bổ sung @Controller
public class LoginWebController {
    @GetMapping("/")
    public String showLoginPage(Model m) {
    	m.addAttribute("hoTen","truong");
        return "index";
    }
    @PostMapping("/login")
    public String handleLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        
        // Kiểm tra đăng nhập (ví dụ đơn giản)
        if ("truong".equals(username) && "123".equals(password)) {
            model.addAttribute("hoTen", username);
            return "index";  // Điều hướng đến trang home.html nếu thành công
        } else {
            model.addAttribute("error", "Invalid username or password!");
            return "index";  // Quay lại trang đăng nhập nếu sai
        }
    }
}

