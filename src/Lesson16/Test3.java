package Lesson16;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";

        System.out.println(a+b+s); //   "a" i "b" skladivautsya
        System.out.println("" + a + b + s); //   "a" i "b"  ne skladivautsya
        System.out.println("" + (a + b) + s); //   "a" i "b" skladivautsya

    }
}
