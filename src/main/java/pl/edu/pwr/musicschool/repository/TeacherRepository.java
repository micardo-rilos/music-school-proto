package pl.edu.pwr.musicschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwr.musicschool.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
