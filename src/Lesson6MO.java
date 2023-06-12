public class Lesson6MO {
    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }

}
 class Lesson6MOTest{
     public static void main(String[] args) {
         Lesson6MO mo2 = new Lesson6MO();
        int a = mo2.sum(5,7);
        System.out.println(a);
        String s = mo2.sum("privet","moy drug");
        System.out.println(s);
     }
 }