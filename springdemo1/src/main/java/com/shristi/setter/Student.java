package com.shristi.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private String dept;
    private Address add;

    public Address getAdd() {
        return add;
    }

    @Autowired
    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", add=" + add +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value("rohit")
    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    @Value("comp")
    public void setDept(String dept) {
        this.dept = dept;
    }
}
