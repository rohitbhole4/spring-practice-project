package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
    @Override
    public void calcArea(int len, int br) {
        System.out.println("Triangle : "+(0.5*len*br));
    }
}
