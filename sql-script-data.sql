use music_school;

insert into student(student_name, student_surname) values("Jan", "Kowalski");
insert into student(student_name, student_surname) values("Robert", "Nowak");
insert into student(student_name, student_surname) values("Jacek", "Kraszewski");
insert into student(student_name, student_surname) values("Grzegorz", "Karpiel");
insert into student(student_name, student_surname) values("Michal", "Pazdan");
insert into student(student_name, student_surname) values("Krzysztof", "Krawczyk");
insert into student(student_name, student_surname) values("Adam", "Ostrowski");
insert into student(student_name, student_surname) values("Fryderyk", "Chopin");
insert into student(student_name, student_surname) values("Tomasz", "Chada");
insert into student(student_name, student_surname) values("Ryszard", "Graniecki");

insert into teacher(teacher_name, teacher_surname) values("Elzbieta", "Ostrowska");
insert into teacher(teacher_name, teacher_surname) values("Stefan", "Kania");
insert into teacher(teacher_name, teacher_surname) values("Stanislaw", "Straburzynski");
insert into teacher(teacher_name, teacher_surname) values("Jerzy", "Jankowski");

insert into school_subject(subject_name) values("Gitara");
insert into school_subject(subject_name) values("Spiew");
insert into school_subject(subject_name) values("Trojkat");

insert into class(class_id, subject_id, teacher_id) values(1, 1, 2);
insert into class(class_id, subject_id, teacher_id) values(2, 2, 1);
insert into class(class_id, subject_id, teacher_id) values(3, 3, 3);
insert into class(class_id, subject_id, teacher_id) values(4, 1, 4);
insert into class(class_id, subject_id, teacher_id) values(5, 1, 2);
insert into class(class_id, subject_id, teacher_id) values(6, 1, 2);
insert into class(class_id, subject_id, teacher_id) values(7, 1, 2);
insert into class(class_id, subject_id, teacher_id) values(8, 1, 2);

insert into lesson(day_of_week, begin_of_class, end_of_class, class_id) values(1, "16:00:00", "16:30:00", 1);
insert into lesson(day_of_week, begin_of_class, end_of_class, class_id) values(3, "15:00:00", "15:30:00", 1);
insert into lesson(day_of_week, begin_of_class, end_of_class, class_id) values(0, "14:00:00", "18:00:00", 2);
insert into lesson(day_of_week, begin_of_class, end_of_class, class_id) values(2, "15:30:00", "16:30:00", 3);
insert into lesson(day_of_week, begin_of_class, end_of_class, class_id) values(4, "16:00:00", "17:30:00", 4);
# insert into lesson(day_of_week, begin_of_class, end_of_class, class_id) values ();


insert into student_class(student_id, class_id) values(1, 1);
insert into student_class(student_id, class_id) values(4, 5);
insert into student_class(student_id, class_id) values(5, 6);
insert into student_class(student_id, class_id) values(7, 7);
insert into student_class(student_id, class_id) values(10, 8);
insert into student_class(student_id, class_id) values(1, 2);
insert into student_class(student_id, class_id) values(2, 2);
insert into student_class(student_id, class_id) values(5, 2);
insert into student_class(student_id, class_id) values(9, 2);
insert into student_class(student_id, class_id) values(2, 3);
insert into student_class(student_id, class_id) values(3, 3);
insert into student_class(student_id, class_id) values(7, 3);
insert into student_class(student_id, class_id) values(9, 3);
insert into student_class(student_id, class_id) values(4, 4);
insert into student_class(student_id, class_id) values(6, 4);
insert into student_class(student_id, class_id) values(7, 4);
insert into student_class(student_id, class_id) values(8, 4);
