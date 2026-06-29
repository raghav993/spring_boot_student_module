package crud.using.Spring.Boot.controller;

import crud.using.Spring.Boot.entity.Course;
import crud.using.Spring.Boot.entity.Student;
import crud.using.Spring.Boot.service.CourseService;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final CourseService courseService;

    public StudentController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courses);
        return "register";
    }
}