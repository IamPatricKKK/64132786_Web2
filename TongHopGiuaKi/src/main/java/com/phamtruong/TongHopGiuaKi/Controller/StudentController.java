package com.phamtruong.TongHopGiuaKi.Controller;

import com.phamtruong.TongHopGiuaKi.Model.Student;
import com.phamtruong.TongHopGiuaKi.Repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentRepository.getAllStudents());
        return "students";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentRepository.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        for (Student s : studentRepository.getAllStudents()) {
            if (s.getId().equals(id)) {
                model.addAttribute("student", s);
                return "edit-student";
            }
        }
        return "redirect:/students";
    }

    @PostMapping("/edit/{id}")
    public String updateStudent(@PathVariable String id, @ModelAttribute Student student) {
        studentRepository.updateStudent(id, student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        studentRepository.deleteStudent(id);
        return "redirect:/students";
    }
}
