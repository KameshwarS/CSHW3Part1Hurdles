package com.CS.HW3Part1.service;

import com.CS.HW3Part1.entities.Student;
import com.CS.HW3Part1.entities.Subject;
import com.CS.HW3Part1.repository.StudentRepository;
import com.CS.HW3Part1.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;


    public Student findById(Long id){
        return studentRepository.findById(id).orElseThrow();
    }


    @Transactional
    public void newSubjectAssignedToStudent(String nameOfSubject, Long stdId) {
        Subject sub=Subject.builder().name(nameOfSubject).build();
        Student std=studentRepository.findById(stdId).orElseThrow();

        if (sub.getStudents() == null) {
            sub.setStudents(new ArrayList<>());
        }
        sub.getStudents().add(std);

        if (std.getSubjects() == null) {
            std.setSubjects(new ArrayList<>());
        }
        std.getSubjects().add(sub);

        subjectRepository.save(sub);





    }
}
