package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;



import com.student.entity.student;

public interface studentRepo extends JpaRepository<student,Long>{

}
