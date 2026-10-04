package com.CS.HW3Part1.repository;

import com.CS.HW3Part1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}