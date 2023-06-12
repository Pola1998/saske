public class Lesson2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xC;//-128;127

        short s1 = 1300;
        short s2 = 0b010100010100;
        short s3 = 02424;
        short s4 = 0x514;//-32768;32767

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;


        long l1 = 123456789;
        long l2 = 0b0111010110111100110100010101;
        long l3 = 0726746425;
        long l4 = 0x75BCD15;

        float f1 = 3.14f;
        float f2 = 20;

        double d1 = 5d;
        double d2 = 87.65;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 300;

        char c6 = '\u1234';

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60;
        int a2 = 0B111100;
        int a3 = 074;
        int a4 = 0x3C;

        int a5 = 1_000_000_000;


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(bool1);
        System.out.println(bool2);


    }
}
