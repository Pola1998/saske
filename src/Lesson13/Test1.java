package Lesson13;

public class Test1 {
}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
//        if (st1.grade==2){
//            System.out.println("Student dvoishnik!");
//        }
//        else if (st1.grade==3){
//            System.out.println("student troishnik");
//        } else if (st1.grade==4) {
//            System.out.println("student xoroshist");
//
//        }else if (st1.grade==5){
//            System.out.println("student otlichnik");
//        }else {
//            System.out.println("ocenka ne verna ");
//        }
        switch (st1.grade) {
            case 2:
                System.out.println("Student dvoishnik!");
                break;
            case 3:
                System.out.println("Student troishnik!");
                break;
            case 4:
                System.out.println("Student xoroshist!");
                break;
            case 5:
                System.out.println("Student otlichnik!");
                break;
            default:
                System.out.println("ocenka ne verna ");

        }
    }
}
