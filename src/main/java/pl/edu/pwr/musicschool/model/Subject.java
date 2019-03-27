package pl.edu.pwr.musicschool.model;

import javax.persistence.*;

@Entity
@Table(name = "school_subject")
public class Subject {

    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    public Subject() {}

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
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
}
