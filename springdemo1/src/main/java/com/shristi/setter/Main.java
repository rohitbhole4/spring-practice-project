package com.shristi.setter;

import com.shristi.training.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi");
        Student s1 = context.getBean("student", Student.class);
        System.out.println(s1);
    }
}
