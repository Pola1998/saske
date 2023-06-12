package Lesson16;

public class Test1 {
    public static void main(String[] args) {


        String s1 = new String("privet");
        int a = s1.length();// dlina stringa "privet"
        System.out.println(a);

        char c1 = s1.charAt(3); // vivedet tretyi simvol
        System.out.println(c1);

        int i1 = s1.indexOf('t'); //vivedet poryadkoviy nomer "t"
        System.out.println(i1);

        int i2 = s1.indexOf("vet"); //vivedet pervoe sovpadenie
        System.out.println(i2);

        int i3 = s1.indexOf("Z"); // vsegda vivedet -1 tak kak "Z" net v stringe "privet"
        System.out.println(i3);


        String s2 = new String("abcdefgabcd");
        int a1 = s2.indexOf("a", 5);// ishem simvol nachinaya c pyatogo
        System.out.println(a1);

        boolean b1 = s2.startsWith("abc");//nachinaetsya li s "abc" - true
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc",7);//nachinaetsya li s sedmogo simvola "abc" - true
        System.out.println(b2);

        boolean b3 = s2.endsWith("abc");// zakanchivaetsya li s "abc" - false
        System.out.println(b3);


    }
}
