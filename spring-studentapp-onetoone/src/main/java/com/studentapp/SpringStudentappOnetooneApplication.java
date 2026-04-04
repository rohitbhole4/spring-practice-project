package com.studentapp;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudentappOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(SpringStudentappOnetooneApplication.class, args);


	}

    private IStudentService service;

    @Autowired
    public void setService(IStudentService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {

        Address add = new Address("kalyan","mh");
        Student stud = new Student("rohit","comp",add);
        service.addStudent(stud);
    }
}
