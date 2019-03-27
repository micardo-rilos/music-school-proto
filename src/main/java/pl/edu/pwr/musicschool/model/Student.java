package pl.edu.pwr.musicschool.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_surname")
    private String studentSurname;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_class",
            inverseJoinColumns = { @JoinColumn(name = "class_id") },
            joinColumns = { @JoinColumn(name = "student_id") }
    )
    private List<Class> classes;

    public Student() {}

    public Student(String studentName, String studentSurname, List<Class> classes) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.classes = classes;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}
