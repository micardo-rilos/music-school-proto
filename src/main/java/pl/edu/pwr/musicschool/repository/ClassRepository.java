package pl.edu.pwr.musicschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwr.musicschool.model.Class;

public interface ClassRepository extends JpaRepository<Class, Integer> {
}
