package edu.ucsc.repository;

import edu.ucsc.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer > {

}
