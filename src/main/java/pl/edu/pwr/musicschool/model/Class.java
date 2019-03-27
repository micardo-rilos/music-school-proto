package pl.edu.pwr.musicschool.model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "class")
public class Class {

    @Id
    @GeneratedValue
    @Column(name = "class_id")
    private int classId;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_class",
            joinColumns = { @JoinColumn(name = "class_id") },
            inverseJoinColumns = { @JoinColumn(name = "student_id") }
    )
    private List<Student> studentsOfClass;

    @Column(name = "begin_of_class")
    private LocalTime beginOfClass;

    @Column(name = "end_of_class")
    private LocalTime endOfClass;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "day_of_week")
    private DayOfWeek dayOfWeek;

    public Class() {}

    public Class(Subject subject, Teacher teacher, List<Student> studentsOfClass, LocalTime beginOfClass,
                 LocalTime endOfClass, DayOfWeek dayOfWeek) {
        this.subject = subject;
        this.teacher = teacher;
        this.studentsOfClass = studentsOfClass;
        this.beginOfClass = beginOfClass;
        this.endOfClass = endOfClass;
        this.dayOfWeek = dayOfWeek;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsOfClass() {
        return studentsOfClass;
    }

    public void setStudentsOfClass(List<Student> studentsOfClass) {
        this.studentsOfClass = studentsOfClass;
    }

    public LocalTime getBeginOfClass() {
        return beginOfClass;
    }

    public void setBeginOfClass(LocalTime beginOfClass) {
        this.beginOfClass = beginOfClass;
    }

    public LocalTime getEndOfClass() {
        return endOfClass;
    }

    public void setEndOfClass(LocalTime endOfClass) {
        this.endOfClass = endOfClass;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
