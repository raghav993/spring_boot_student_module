package crud.using.Spring.Boot.service;

import java.util.List;
import org.springframework.stereotype.Service;

import crud.using.Spring.Boot.entity.Course;
import crud.using.Spring.Boot.repository.CourseRepository;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
