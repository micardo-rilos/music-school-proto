package pl.edu.pwr.musicschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwr.musicschool.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
