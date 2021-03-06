create database if not exists music_school;

use music_school;

drop table if exists student_class;
drop table if exists lesson;
drop table if exists class;
drop table if exists student;
drop table if exists teacher;
drop table if exists school_subject;
drop table if exists student;

create table if not exists teacher
(
	teacher_id int primary key auto_increment,
    teacher_name varchar(255) not null,
    teacher_surname varchar(255) not null
);

create table if not exists student
(
	student_id int primary key auto_increment,
    student_name varchar(255) not null,
    student_surname varchar(255) not null
);

create table if not exists school_subject
(
	subject_id int primary key auto_increment,
    subject_name varchar(255) not null
);

create table if not exists class
(
	class_id int primary key auto_increment,
    subject_id int not null,
    teacher_id int not null,
    
    foreign key class_subject_id_fk(subject_id) references school_subject(subject_id),
    foreign key class_teacher_id_fk(teacher_id)references teacher(teacher_id)
);


create table if not exists lesson
(
  lesson_id int primary key auto_increment,
  begin_of_class time not null,
  end_of_class time not null,
  day_of_week int check(day_of_week <= 6 and day_of_week >=0),
  class_id int not null,

  foreign key lesson_class_id_fk(class_id)references class(class_id)
);

create table if not exists student_class
(
	student_id int,
    class_id int,
    
	foreign key student_class_student_id_fk(student_id) references student(student_id),
    foreign key student_class_class_id_fk(class_id) references class(class_id),
    primary key(student_id, class_id)
);