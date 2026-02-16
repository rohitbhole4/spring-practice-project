package com.shristi.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Features {
    private String os;
    private String brand;

    @Override
    public String toString() {
        return "Features{" +
                "os='" + os + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getOs() {
        return os;
    }
    @Value("android")
    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    @Value("samsung")
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
