package pl.edu.pwr.musicschool.model;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "teacher_id")
    private int teacherId;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "teacher_surname")
    private String teacherSurname;

    public Teacher() {}

    public Teacher(int teacherId, String teacherName, String teacherSurname) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }
}
