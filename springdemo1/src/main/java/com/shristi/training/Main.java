package com.shristi.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi");
        Employee emp1 = context.getBean("employee", Employee.class);
        System.out.println(emp1);
        Employee emp2 = context.getBean(Employee.class);
        System.out.println(emp2);
        Employee emp3 = (Employee) context.getBean("employee");
        System.out.println(emp3);
    }
}
