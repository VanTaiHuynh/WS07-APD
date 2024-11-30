package com.example.WS07;

import com.example.WS07.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.WS07.service.StudentService;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Ws07Application {

	public static void main(String[] args) {
		ApplicationContext context =   SpringApplication.run(Ws07Application.class, args);


		// Get the StudentService bean
		StudentService studentService = context.getBean(StudentService.class);

		// Add new Student
		Student student1 = new Student();
		student1.setName("John Doe");
		student1.setAge(20);
		student1.setEmail("johndoe@gmail.com");
		Student savedStudent1 = studentService.saveStudent(student1);
		System.out.println("Added Student: " + savedStudent1);

		Student student2 = new Student();
		student2.setName("Jane Smith");
		student2.setAge(21);
		student2.setEmail("jansmith@gmail.com");
		Student savedStudent2 = studentService.saveStudent(student2);
		System.out.println("Added Student: " + savedStudent2);


	}


}
