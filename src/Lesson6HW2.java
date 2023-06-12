public class Lesson6HW2 {
    Lesson6HW2(int number2, String name2, String surname2, int course2, double mat2, double econ2, double lang2) {
        this (number2,name2,surname2,course2);
        mat = mat2;
        econ = econ2;
        lang = lang2;
    }

    Lesson6HW2(int number3, String name3, String surname3, int course3) {
        number = number3;
        name = name3;
        surname = surname3;
        course = course3;
    }

    Lesson6HW2(){}

    int number;
    String name;
    String surname;
    int course;
    double mat;
    double econ;
    double lang;
}
class Lesson6HW2Test{
    public static void main(String[] args) {
        Lesson6HW2 st = new Lesson6HW2();
        Lesson6HW2 st1 = new Lesson6HW2(1,"Serg","Muratov", 4,3.4,4.4,5.0);
        Lesson6HW2 st2 = new Lesson6HW2(1,"Serg","Muratov", 4);


    }
}