package pl.edu.pwr.musicschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwr.musicschool.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
