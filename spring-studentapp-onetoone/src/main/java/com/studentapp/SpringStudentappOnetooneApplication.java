package com.studentapp;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

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

       // Address add = new Address("badlapur","mh");
       // Student stud = new Student("amar","maths",add);
       // service.addStudent(stud);

        Student studObj = service.getById(1);
        System.out.println(studObj);
        studObj.setStudentName("MAYURI BHOLE");
        studObj.getAddress().setCity("dombivali");
        studObj.setDept("maths");
       // Student studUpdate = service.updateStudent(studObj);
       // System.out.println(studUpdate);

        System.out.println("find all...");
        service.findAll().forEach(System.out::println);

        System.out.println("find by dept...");
        service.findByDept("maths").forEach(System.out::println);

        System.out.println("find by city...");
        service.findByAddressCity("mumbai").forEach(System.out::println);

    }
}
