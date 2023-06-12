package Lesson14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i==7){
                break;} // закончит цикл при ==7
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            if(i==87){
                continue;}
            System.out.println(i);//выведет всё кроме 87
        }
    }
}