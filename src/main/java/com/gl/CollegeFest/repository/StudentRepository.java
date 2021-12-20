package com.gl.CollegeFest.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.CollegeFest.entities.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
