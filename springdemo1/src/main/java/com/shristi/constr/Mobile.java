package com.shristi.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private String model;
    private double price;
    private Features feat;

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", feat=" + feat +
                '}';
    }

    public Mobile(Features feat) {
        this.feat = feat;
    }

    public String getModel() {
        return model;
    }

    @Value("Galaxy")
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    @Value("36000")
    public void setPrice(double price) {
        this.price = price;
    }
}
