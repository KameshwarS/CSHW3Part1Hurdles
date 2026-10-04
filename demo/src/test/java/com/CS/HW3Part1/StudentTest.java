package com.CS.HW3Part1;

import com.CS.HW3Part1.entities.Student;
import com.CS.HW3Part1.entities.Subject;
import com.CS.HW3Part1.repository.ProfessorRepository;
import com.CS.HW3Part1.repository.StudentRepository;
import com.CS.HW3Part1.service.ProfessorService;
import com.CS.HW3Part1.service.StudentService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentTest{

    @Autowired
    private StudentService studentService;

    @Autowired
    private ProfessorService professorService;

    @Test
    public void newSubjectAssignToStudent(){

        studentService.newSubjectAssignedToStudent("Chironn",1L);

        List<Subject> subs=studentService.findById(1L).getSubjects();

        for(Subject s:subs) System.out.println(s);





    }
}
