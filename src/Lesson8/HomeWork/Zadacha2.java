package Lesson8.HomeWork;

public class Zadacha2 {


        int a = 1;
        static int b = 2;
        void abc(int a){
            System.out.println(a);
            System.out.println(this.a);
        }

    public static void main(String[] args) {
        Zadacha2 t = new Zadacha2();
        t.abc(3);
    }
}
