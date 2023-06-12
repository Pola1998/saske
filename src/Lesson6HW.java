public class Lesson6HW {

    int sum(){
        int result = 0;
        System.out.println(result);
        return result;
    }
    int sum (int a){
        int result1= a;
        System.out.println(result1);
        return result1;
    }
    int sum(int a, int b) {
        int result2 = a + b;
        System.out.println(result2);
        return result2;
    }

    int sum(int a, int b, int c) {
        int result3 = a + b+c;
        System.out.println(result3);
        return result3;
    }
    int sum(int a, int b, int c, int e) {
        int result4 = a + b+c+e;
        System.out.println(result4);
        return result4;
    }
}
class Lesson6HWTest {
    public static void main(String[] args) {

        Lesson6HW h = new Lesson6HW();
        h.sum();
        h.sum(1);
        h.sum(1,2);
        h.sum(1,2,3);
        h.sum(1,2,3,4);


    }

}