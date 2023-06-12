package Lesson12;

public class Test10 {


    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3)
            System.out.println("maximum - " + i1);
        else if (i2 > i1 && i2 > i3)
            System.out.println("maximum - " + i2);
        else
            System.out.println("maximum - " + i3);
    }

    void abc() {
        String str;
        int a1 = 10;
        if (a1 >= 10) {
            str = "privet";
            if (a1 < 10) {
                str = "poka";
            }
            System.out.println(str);
        }

        }


        public static void main (String[]args) {
            int a = 10;
            if (a < 20) {
                System.out.println("a menshe 20");
            } else {
                System.out.println("a ne menshe 20");
            }
            System.out.println("privet");

            int salary = 1500;

            if (salary < 200) {
                System.out.println("zp ne och");
            } else if (salary < 400) {
                System.out.println("zp norm");
            } else if (salary < 600) {
                System.out.println("zp zaebis");
            } else {
                System.out.println("zp otlichnaya");
            }

            Test10 t = new Test10();
            t.maximum(4, 7, 0);





            int i1=10;
            int i2=20;
            int maximum = (i1>i2)?i1:i2;
            System.out.println(maximum);


        }
    }
