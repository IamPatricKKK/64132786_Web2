package com.phamtruong.TongHopGiuaKi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")  // Trang chủ
    public String home() {
        return "index"; 
    }

    @GetMapping("/about")  // Trang About
    public String about() {
        return "about"; 
    }

    @GetMapping("/list")  // Trang List
    public String list() {
        return "list"; 
    }

    @GetMapping("/addnew")  // Trang Add New
    public String addnew() {
        return "addnew"; 
    }
}
