package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        String s10 = s1.substring(3); // prisvoy znachenie nachinaya s tretigo simvola - "defgabcd"
        System.out.println(s10);
        System.out.println(s1); // ni odin metod ne menyaet sam String -"abcdefgabcd"

        String s11 = s1.substring(3,7); // vkluchaet  v sebya 3iy simvol, no ne vkluchaet 7iy
        System.out.println(s11);

        String s12 = s1.trim(); // ubiraet probeli v nachale i konce
        System.out.println(s12);

        String s13 = s1.substring(3,11);/* 11go elemetta - net,
        no chto bi voshol ves string pishem (3,11) i vivedet 10iy simvol*/
        System.out.println(s13);

        String s14 = s1.replace('a','z');// menyaet simvol a na z
        System.out.println(s14);

        String s15 = s1.replace("abc","cba"); //tak je menyaet
        System.out.println(s15);

        String s2 = "poka";
        String s3 = s2.replace('k','k');
        System.out.println(s2==s3);

        String s5 = "privet,";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
        System.out.println(s5+s6);
    }
}
