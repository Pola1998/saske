package Lesson8;

public class Student {
    String name;
    int course;
   static int count;

    public Student (String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student №"+count+" sozdan");

    }
    public  static void showCount(){
        System.out.println("Vsego sozdano studentov " + count);

    }
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Serg", 2);
        Student st3 = new Student("Nika", 4);
        Student.showCount();

    }
}