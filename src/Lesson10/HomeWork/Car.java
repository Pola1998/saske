package Lesson10.HomeWork;

public class Car {
    String color;
    String engine;
    int door;

    Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }
}
    class CarTest {

        void ChangeDoor(Car c , int door) {
            c.door = door;
        }

        int ChDoor (Car c5, int door) {
           c5.door=door;
            return door;
        }

        void SwapColor(Car s1, Car s2) {
            String color = s1.color;
            s1.color = s2.color;
            s2.color = color;


        }

        public static void main(String[] args) {

            Car c1 = new Car("black", "v6", 5);
            Car c2 = new Car("white", "v8", 3);


        }
    }





