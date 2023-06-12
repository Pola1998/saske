public class Lesson3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;
        int c = a/b;

        double d1 = 10.4;
        double d2 = 3.1;
        double d3 = d1/d2;
        double ostatok1 = d1%d2;

        int celayachast = a/b;
        int ostatok = a%b; // 20-14(7*2) = 6
        System.out.println(ostatok1);

        int x = 5;
        int y = 3;
        int z = x-y++;

        int a1=3;
        int a2=5;

        a2-=2;

        boolean b1 = a>b;
        boolean b2 = a>=b;
        boolean b3 = a!=b;
        boolean b4 = a==b;

        boolean x1= true ;
        boolean x2= false;
        boolean x3= true;

        boolean result = x1&&x2&&x3;
        boolean result1 = x1||x2||x3;

        System.out.println(result);
        System.out.println(result1 );



        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        //HomeWork

        int i1 = 5;
        int i2 = 11;
        double dd1 = 5.5;
        double dd2 = 1.3;
        long l = 20L;
        double result2 = 0;
        result2 = i2 / dd1 + dd2 % i1 - l;
               // 11 / 5.5 + 1.3 % 5 - 20 =
               //     2    +     1.3 - 20 = 16.7
        System.out.println(result2);

        int aa1 = 5;
        int aa2 = 8;
        System.out.println(aa1-- - --aa1 + ++aa1 + aa1++ + aa1);
                         // 5    -    3  +    4  +   4   +  5= 15
        System.out.println(++aa2 - aa2++ + ++aa2 - --aa2);
                         // 9    -   9   +  11   -   10 = 1


    }
}
