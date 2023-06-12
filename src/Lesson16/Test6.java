package Lesson16;

public class Test6 {
    public static void main(String[] args) {
        String s = "PriVet:2";
        String s2 = s.toLowerCase();// vse bukvi stanut malenkimi
        System.out.println(s2);


        String s3 = s.toUpperCase(); //naoborot
        System.out.println(s3);

        boolean b = s.contains(":2"); // soderjit li v sebe ":2" - true
        System.out.println(b);


    }
}
