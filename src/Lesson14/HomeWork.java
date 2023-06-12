package Lesson14;

public class HomeWork {
    public static void main(String[] args) {
        for (int chas = 0; chas <= 5; chas++) {
            for (int min = 0; min <= 59; min++) {
                    for (int sec = 0; sec <= 59; sec++) {
                        if (chas>1 && min %10 == 0){break;}
                        if (sec*chas>min){continue;}
                        System.out.println(chas + ":" + min + ":" + sec);
                    }
                }
            }
        }
    }
