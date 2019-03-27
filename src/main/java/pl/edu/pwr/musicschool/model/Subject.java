package pl.edu.pwr.musicschool.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "school_subject")
public class Subject {

    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Class> classes;

    public Subject() {}

    public Subject(String subjectName, List<Class> classes) {
        this.subjectName = subjectName;
        this.classes = classes;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}
