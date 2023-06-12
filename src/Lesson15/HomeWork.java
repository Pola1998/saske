package Lesson15;

public class HomeWork {
    public static void main(String[] args) {
        int chas = 0;
        OUTER:
        while (chas < 5) {
            chas++;
            int min = -1;
            MIDDLE:
            do {
                min++;
                if (chas>1 && min %10 == 0){break OUTER;
                }

            int sec = 0;
                INNER:
            while (sec <60){
                if (sec*chas>min){continue MIDDLE;
                }
                    System.out.println(chas + ":" + min + ":" + sec);
                    sec++;
                }
                while (sec < 60);
            } while (min<59);
            chas++;
            }
        }
    }

