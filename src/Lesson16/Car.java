package Lesson16;

import P1.P2.P3.C;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String cvet) {
        Car c10 = new Car(cvet, "v4");
        return c10;
    }


    public static void main(String[] args) {
        Car c = new Car("red","v6");
        Car c2 = c.abc("black");
        System.out.println(c.color);


    }
}