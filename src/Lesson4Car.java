public class Lesson4Car {
    String color = "red";
    String engine = "v6";
}
class CarTest{
    public static void main(String[] args) {

        int a;
        Lesson4Car car1 = new Lesson4Car();
        car1.color="black";
        car1.engine="v8";


        System.out.println("Cvet: " + car1.color);
        System.out.println("Motor: " + car1.engine);
    }

}
