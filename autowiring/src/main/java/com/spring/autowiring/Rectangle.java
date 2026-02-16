package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
    @Override
    public void calcArea(int len, int br) {
        System.out.println("reactanle : "+(len*br));
    }
}
