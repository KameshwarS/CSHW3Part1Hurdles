package com.CS.HW3Part1.repository;

import com.CS.HW3Part1.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}