package pl.edu.pwr.musicschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.pwr.musicschool.repository.ClassRepository;
import pl.edu.pwr.musicschool.repository.StudentRepository;
import pl.edu.pwr.musicschool.repository.SubjectRepository;
import pl.edu.pwr.musicschool.repository.TeacherRepository;

@Controller
public class MainController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private ClassRepository classRepository;

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/students")
    String getStudents(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "students";
    }

    @GetMapping("/teachers")
    String getTeachers(Model model) {
        model.addAttribute("teachers", teacherRepository.findAll());
        return "teachers";
    }

    @GetMapping("/classes")
    String getClasses(Model model) {
        model.addAttribute("classes", classRepository.findAll());
        return "classes";
    }

    @GetMapping("/subjects")
    String getSubjects(Model model) {
        model.addAttribute("subjects", subjectRepository.findAll());
        return "subjects";
    }
}
