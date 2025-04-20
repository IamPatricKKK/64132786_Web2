package thiGK.ntu64132786.controller;

import thiGK.ntu64132786.model.Page;
import thiGK.ntu64132786.repository.PageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pages")
public class PageController {

	private final PageRepository pageRepository;

    public PageController(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @GetMapping
    public String listPages(Model model) {
        model.addAttribute("pages", pageRepository.getAllPages());
        return "pages";
    }
    
    @GetMapping("/view/{id}")
    public String viewPageDetails(@PathVariable String id, Model model) {
        for (Page p : pageRepository.getAllPages()) {
            if (p.getId().equals(id)) {
                model.addAttribute("page", p);
                return "view-page";
            }
        }
        return "redirect:/pages";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("page", new Page());
        return "add-page";
    }

    @PostMapping("/add")
    public String addPage(@ModelAttribute Page page) {
    	pageRepository.addPage(page);
        return "redirect:/pages";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        for (Page s : pageRepository.getAllPages()) {
            if (s.getId().equals(id)) {
                model.addAttribute("page", s);
                return "edit-page";
            }
        }
        return "redirect:/pages";
    }

    @PostMapping("/edit/{id}")
    public String updatePage(@PathVariable String id, @ModelAttribute Page page) {
    	pageRepository.updatePage(id, page);
        return "redirect:/pages";
    }

    @GetMapping("/delete/{id}")
    public String deletePage(@PathVariable String id) {
    	pageRepository.deletePage(id);
        return "redirect:/pages";
    }
}

