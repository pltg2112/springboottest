package com.pltg.springboottest.repository;

import com.pltg.springboottest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
