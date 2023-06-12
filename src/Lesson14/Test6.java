package Lesson14;

public class Test6 {
    public void time(){
        for (int chas =0; chas<=23;chas++){
            for (int min =0; min<=59;min++){
                System.out.println(chas + ":" + min);
            }

        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
