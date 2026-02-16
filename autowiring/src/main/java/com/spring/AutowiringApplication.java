package com.spring;

import com.spring.autowiring.Shapefactory;
import com.spring.training.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {

        //SpringApplication.run(AutowiringApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        Shapefactory sf = context.getBean("shapefactory", Shapefactory.class);
        sf.printArea(10,20);

        Employee emp = context.getBean("employee", Employee.class);
        System.out.println(emp);
    }
}
