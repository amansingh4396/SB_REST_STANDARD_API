package com.cjc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.cjc.Repository.StudentRepository;
import com.cjc.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repo = context.getBean(StudentRepository.class);
	
		List<Integer> list = Arrays.asList(104,105,106,106);
		
		List<Student> stu = repo.findByRollnoIn(list);

		for(Integer stu1 : list)
		{
			System.out.println(stu1);
		}
		
	//	OrderByMarks(repo);
          
	
		
		//FindByNameOrAddress(repo);
	
		// FindByNameAndAddress(repo);

		// FindByNAme(repo);

		// ExampleByQuery(repo);

		// sort(repo);

		// saveAll(repo);
	}

	private static void OrderByMarks(StudentRepository repo) {
		List<Student> list = repo.OrderByRollnoDesc();
		
		for(Student stu : list)
		{
			System.out.println(stu);
		}
	}

	private static void FindByNameOrAddress(StudentRepository repo) {
		List<Student> list = repo.findByNameOrAddress("Aman", "Pune");
		
		for(Student stu : list)
		{
			System.out.println(stu);
		}
	}

	private static void FindByNameAndAddress(StudentRepository repo) {
		List<Student> list = repo.findByNameAndAddress("Aman", "Pune");
		
		for(Student stu : list)
		{
			System.out.println(stu);
		}
	}

	private static void FindByNAme(StudentRepository repo) {
		List<Student> list = repo.findByName("Aman");
		
		for(Student stu : list)
		{
			System.out.println(stu);
		}
	}

	private static void ExampleByQuery(StudentRepository repo) {
		Student stu = new Student();
		stu.setContact_NO(9021522842l);
		
		
		Example<Student> example = Example.of(stu);
		List<Student> list = repo.findAll(example);

		
		for(Student stu1 : list)
		{
			System.out.println(stu1);
		}
	}

	private static void sort(StudentRepository repo) {
		Sort sort = Sort.by("name");
		 List<Student> Sort = repo.findAll(sort);
		 
		 for(Student stu :Sort)
		 {
			 System.out.println(stu);
		 }
	}

	private static void saveAll(StudentRepository repo) {
		Student stu = new Student(101,"Aman", "Sangvi", 9021522842l);
		Student stu1 = new Student(102,"Ashish", "Pune", 8668300609l);
		Student stu2 = new Student(103,"Vivek", "Pune", 646464545l);
		Student stu3 = new Student(104,"Aman", "Pune", 563636363l);
		Student stu4 = new Student(105,"Ashish", "Sangvi", 9021522842l);
		Student stu5 = new Student(106,"Varsha", "Lohgaon", 647454745l);
		Student stu6 = new Student(107,"Jay", "Wagholi", 6474564746l);
		Student stu7 = new Student(108,"Saurabh", "Nagar", 677545733l);
		Student stu8 = new Student(109,"Vishal", "Sangvi", 767547546l);
		Student stu9 = new Student(110,"Kuldeep", "Sangvi", 656563434l);
		
		List<Student> list = Arrays.asList(stu , stu1 ,stu2 , stu3 , stu4 , stu5 , stu6 , stu7 , stu8 , stu9 );
		
		
		repo.saveAll(list);
	}

}
