package pl.edu.pwr.musicschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwr.musicschool.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
