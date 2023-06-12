package Lesson9;

public class Car {
    String color;
    String engine;
    public static int count;
    public static int ab = 10;

   public Car(String color2, String engine2) {
        int x=5;
        int y = x+10;
        count++;
        color = color2;
        engine = engine2;
    }
public void showColor(){
        System.out.println("Cvet Mashini: " + color);
}
public void changeColor(String color3){
        System.out.println(color3);
        int cena = 5000;
        color = color3;
        cena+=1000;
}
}
