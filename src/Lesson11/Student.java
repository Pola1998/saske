package Lesson11;

public class Student {
    String name ;
    int course;
    double grade;
    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap (Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName (Student s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 4.1);
        Student st2 = new Student("Ivan", 1, 4.1);
        Student st3 = new Student("Petr", 1, 3.2);
        StudentTest studentTest = new StudentTest();

        studentTest.str1(st2, st1);
        studentTest.str2(st1,st2);

//        System.out.println(st1);

//        swap(st1, st2);
//        System.out.println(st1.name);
//        System.out.println(st2.name);
//
//        changeName(st2);
//        System.out.println(st2.name);



    }
}
class StudentTest {

    void str1(Student abc, Student cde) {
        if (abc.name.equals(cde.name) && abc.course == cde.course && abc.grade == cde.grade) {
            System.out.println("Studenti ravni");
        } else {
            System.out.println("Studenti ne ravni");
        }
    }

        void str2 (Student abc, Student cde){
            if (abc.name.equals(cde.name)){
                if (abc.course== cde.course){
                    if (abc.grade==cde.grade){
                        System.out.println("imya, kurs i oceka odinakovi!");
                    }
                    else {
                        System.out.println("imya, kurs odinakovi, no ocenki razni");
                }}else {
                        System.out.println("imya odinakovi, no kurs i oceka razni!");
                    }
            }else {
                System.out.println("stidenti razni");
            }
    }
}



