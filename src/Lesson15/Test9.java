package Lesson15;

public class Test9 {
    public static void main(String[] args) {
        int chas = 0;
        do {
            int min = 0;

            while (min < 60) {
                System.out.println(chas + ":" + min);
                min++;
            }
            chas++;
        }
        while (chas<24);
    }
    }
