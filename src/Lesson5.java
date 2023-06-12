public class Lesson5 {

    int summa(int a,int b, int c) {
     int result = a+b+c;
     return result;
    }

    int sredneeArifm(int a1,int b1,int c1){
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }

}

class Test2 {
    public static void main(String[] args) {
        Lesson5 t = new Lesson5();
        int summatrexChisel = t.summa(1,2,3);
        System.out.println(t.sredneeArifm(20,40,60));
        System.out.println(t.summa(5,10,15));

    }
}
