//MethodOverloading
public class Lesson6 {
    void show(int i1) {
        System.out.println(i1);
    }
    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }
}

class MethodOverloading{
    public static void main(String[] args) {
        Lesson6 mo = new Lesson6();
        int a = 500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String s = "Privet";
        mo.show (s);
    }
}