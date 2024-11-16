package com.cjc.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

  List<Student> findByName(String name);
  
  List<Student> findByNameAndAddress(String name , String address);
	
  List<Student> findByNameOrAddress(String name , String address);
  
  List<Student>  findByRollnoIn(List<Integer>list);
  
  List<Student> OrderByRollnoDesc();
  
}
