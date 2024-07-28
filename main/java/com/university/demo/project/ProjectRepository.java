package com.university.demo.project;

import com.university.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
