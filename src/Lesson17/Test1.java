package Lesson17;

public class Test1 {
    public static   void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();// pervonachalnaya vmestimost 16 simvolov po defoltu
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50); //vmestimost 50
        StringBuilder sb4 = new StringBuilder(sb2);
//xcsazxz
        System.out.println(sb2.length());
        System.out.println(sb3.length());

        System.out.println(sb2.charAt(5));

        System.out.println(sb2.indexOf(" "));

        String s1 = sb2.substring(5);
        System.out.println(s1);
        String s2 = sb2.substring(5,8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8));
//
//        sb2.append(22);
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//        sb2.append("hello");
//        System.out.println(sb2);

        System.out.println(sb2.insert(sb2.length(),"hello"));

        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(4,6);
//        System.out.println(sb10);

        sb10.deleteCharAt(6);
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem Privet");

        sb12.replace(0,5, "Pete");
        System.out.println(sb12);
        System.out.println(sb12.capacity());



    }
}
