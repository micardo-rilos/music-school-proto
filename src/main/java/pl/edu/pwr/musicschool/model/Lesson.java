package pl.edu.pwr.musicschool.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue
    @Column(name = "lesson_id")
    private int id;

    @Column(name = "begin_of_class")
    private LocalTime beginOfClass;

    @Column(name = "end_of_class")
    private LocalTime endOfClass;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "day_of_week")
    private DayOfWeek dayOfWeek;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class aClass;

    public Lesson() {}

    public Lesson(LocalTime beginOfClass, LocalTime endOfClass, DayOfWeek dayOfWeek, Class aClass) {
        this.beginOfClass = beginOfClass;
        this.endOfClass = endOfClass;
        this.dayOfWeek = dayOfWeek;
        this.aClass = aClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
