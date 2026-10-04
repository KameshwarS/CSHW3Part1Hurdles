package com.CS.HW3Part1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @ManyToMany(mappedBy = "students",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Subject> subjects;

    @ManyToMany(mappedBy = "students")
    @ToString.Exclude
    private List<Professor> professors;

    @OneToOne(mappedBy = "student")
    private AdmissionRecord admissionRecord;
}
