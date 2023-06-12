package HomeWork;

public class Lesson8 {
    static int ab (int a, int b, int c){
        int result = a*b*c;
        return result;

    }

    static double abc(double a1, double b1){
        double result1 = a1/b1;
        return result1;
    }
}

class HomeWorkTest{
    public static void main(String[] args) {
        System.out.println(Lesson8.ab(2,3,4));
        Lesson8.abc(9,2);
        System.out.println(Lesson8.ab(4,3,5));
        Lesson8.abc(15,4);



    }
}