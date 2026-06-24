package crud.using.Spring.Boot.controller;

import crud.using.Spring.Boot.entity.Course;
import crud.using.Spring.Boot.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    public CourseService courseService;

    @GetMapping("/register")
    public String register(Model model) {
        List<Course> courses = courseService.getAllCourses();

        courses.forEach(course -> {
            System.out.println(course.getId() + " - " + course.getName());
        });
        model.addAttribute("courses", courses);
        return "register";
    }
}