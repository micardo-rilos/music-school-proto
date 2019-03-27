create database if not exists music_school;

use music_school;

create table if not exists teacher
(
	teacher_id int primary key,
    teacher_name varchar(255) not null,
    teacher_surname varchar(255) not null
);

create table if not exists student
(
	student_id int primary key,
    student_name varchar(255) not null,
    student_surname varchar(255) not null
);

create table if not exists school_subject
(
	subject_id int primary key,
    subject_name varchar(255) not null
);

create table if not exists class
(
	class_id int primary key,
    subject_id int not null,
    teacher_id int not null,
    day_of_week int check(day_of_week >= 1 and day_of_week <= 7),
    begin_of_class time not null,
    end_of_class time not null
);