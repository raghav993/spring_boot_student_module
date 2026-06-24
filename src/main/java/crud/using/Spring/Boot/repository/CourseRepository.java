package crud.using.Spring.Boot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import crud.using.Spring.Boot.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
}

