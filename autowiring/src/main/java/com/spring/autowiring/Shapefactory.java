package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shapefactory {
    @Autowired
    @Qualifier("triangle")
    Shape shape;

    public void printArea(int x, int y){
        System.out.println("printing area");
        shape.calcArea(x,y);
    }
}
