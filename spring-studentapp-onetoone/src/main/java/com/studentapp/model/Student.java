package com.studentapp.model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
public class Student {
    @Id
    @GeneratedValue(generator = "stud_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "stud_gen",sequenceName = "stud_seq",initialValue = 1,allocationSize = 1)
    private Integer StudentId;
    private String StudentName;
    private String dept;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", dept='" + dept + '\'' +
                ", address=" + address +
                '}';
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String studentName, String dept, Address address) {
        StudentName = studentName;
        this.dept = dept;
        this.address = address;
    }

    public Student() {
    }
}
