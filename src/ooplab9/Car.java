package ooplab9;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car {
    private  String brand; //ยี่ห้อ
    private  String model; // เช่น โตโยต้า
    private  String color; //สีรถ
    private Engine engine; //เครื่องยนต์

    public Car(String brand, String model,
               String color, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    //getter and setter method


    @Override
    public String toString() {
        return "Car{" +
                "beand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getBeand() {
        return brand;
    }

    public void setBeand(String beand) {
        this.brand = beand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

