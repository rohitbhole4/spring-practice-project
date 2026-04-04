package com.studentapp.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(generator = "add_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "add_gen",sequenceName = "add_seq",initialValue = 10,allocationSize = 1)
    private Integer AddId;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "AddId=" + AddId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Integer getAddId() {
        return AddId;
    }

    public void setAddId(Integer addId) {
        AddId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address() {
    }
}
