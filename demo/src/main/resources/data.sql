-- 1. Insert Students (Auto-generated IDs)
INSERT INTO student (name) VALUES ('Aarav Sharma');
INSERT INTO student (name) VALUES ('Priya Patel');
INSERT INTO student (name) VALUES ('Rohan Verma');
INSERT INTO student (name) VALUES ('Ananya Gupta');

-- 2. Insert Professors (Auto-generated IDs)
INSERT INTO professor (name) VALUES ('Dr. Alan Turing');
INSERT INTO professor (name) VALUES ('Dr. Grace Hopper');

-- 3. Insert Subjects (Auto-generated IDs, referencing professor_id by logical order)
-- Note: Since professors are inserted in order, Dr. Alan Turing is id 1 and Dr. Grace Hopper is id 2.
INSERT INTO subject (name, professor_id) VALUES ('Data Structures', 1);
INSERT INTO subject (name, professor_id) VALUES ('Operating Systems', 1);
INSERT INTO subject (name, professor_id) VALUES ('Database Management', 2);

-- 4. Insert Admission Records (Auto-generated IDs, referencing student_id 1 to 4)
INSERT INTO admission_record (fees, student_id) VALUES (50000, 1);
INSERT INTO admission_record (fees, student_id) VALUES (55000, 2);
INSERT INTO admission_record (fees, student_id) VALUES (50000, 3);
INSERT INTO admission_record (fees, student_id) VALUES (60000, 4);

-- 5. Insert Professor-Student Join Table (Many-to-Many)
INSERT INTO professor_student (professor_id, student_id) VALUES (1, 1);
INSERT INTO professor_student (professor_id, student_id) VALUES (1, 2);
INSERT INTO professor_student (professor_id, student_id) VALUES (2, 3);
INSERT INTO professor_student (professor_id, student_id) VALUES (2, 4);

-- 6. Insert Subject-Student Join Table (Many-to-Many)
INSERT INTO subject_student (subject_id, student_id) VALUES (1, 1);
INSERT INTO subject_student (subject_id, student_id) VALUES (1, 2);
INSERT INTO subject_student (subject_id, student_id) VALUES (2, 3);
INSERT INTO subject_student (subject_id, student_id) VALUES (3, 4);