package com.bd.dipti.CGPA.repo;

import com.bd.dipti.CGPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    public Integer countById(Integer id);
}
