package com.shristi.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private Integer id;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("rohit")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    @Value("0111")
    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    @Value("25000.00")
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
