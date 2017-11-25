CREATE TABLE hb_student_tracker.student
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    first_name varchar(45),
    last_name varchar(45),
    email varchar(45)
);
INSERT INTO hb_student_tracker.student (first_name, last_name, email) VALUES ('Jasbir2', 'Minhas2', 'jasbir2.minhas@loblaw.ca');