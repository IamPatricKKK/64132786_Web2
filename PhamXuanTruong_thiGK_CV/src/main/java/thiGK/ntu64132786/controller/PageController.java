package thiGK.ntu64132786.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thiGK.ntu64132786.model.Page;

@Controller
@RequestMapping("/page")

public class PageController {

	private final List<Page> pages = new ArrayList<>();

    // Hiển thị danh sách Page
    @GetMapping("/list")
    public String listPages(Model model) {
        model.addAttribute("pages", pages);
        return "page-list";
    }

    // Thêm mới Page
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("page", new Page());
        return "add-page";
    }

    @PostMapping("/add")
    public String addPage(@ModelAttribute Page page) {
        pages.add(page);
        return "redirect:/page/list";
    }

    // Sửa Page
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        for (Page p : pages) {
            if (p.getId().equals(id)) {
                model.addAttribute("page", p);
                return "edit-page";
            }
        }
        return "redirect:/page/list";
    }

    @PostMapping("/edit/{id}")
    public String updatePage(@PathVariable String id, @ModelAttribute Page page) {
        for (int i = 0; i < pages.size(); i++) {
            if (pages.get(i).getId().equals(id)) {
                pages.set(i, page);
                break;
            }
        }
        return "redirect:/page/list";
    }

    // Xóa Page
    @GetMapping("/delete/{id}")
    public String deletePage(@PathVariable String id) {
        pages.removeIf(p -> p.getId().equals(id));
        return "redirect:/page/list";
    }
}
