package com.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {
    private String name;
    private double salary;
    private String dept;
    private Address add;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", add=" + add +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value("${employee.name}")
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Value("${employee.salary}")
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    @Value("${employee.dept}")
    public void setDept(String dept) {
        this.dept = dept;
    }

    public Address getAdd() {
        return add;
    }

    @Autowired
    public void setAdd(Address add) {
        this.add = add;
    }
}
