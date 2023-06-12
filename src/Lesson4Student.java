public class Lesson4Student {

    Lesson4Student(int number2, String name2, String surname2, int course2, double mat2, double econ2, double lang2) {
        this (number2,name2,surname2,course2);
        mat = mat2;
        econ = econ2;
        lang = lang2;
    }

    Lesson4Student(int number3, String name3, String surname3, int course3) {
        number = number3;
        name = name3;
        surname = surname3;
        course = course3;
    }

    Lesson4Student(){}
    int number;
    String name;
    String surname;
    int course;
    double mat;
    double econ;
    double lang;



}
class StudentTest{
    double sredneeArifm(Lesson4Student student) {
        double result2 = (student.mat + student.econ + student.lang) / 3;
        System.out.println("SredOcen " + student.name +" " + student.surname + ": " + result2);
        return result2;
    }

    public static void main(String[] args){
            Lesson4Student student1 = new Lesson4Student();



            student1.number = 1;
            student1.name = "Serg";
            student1.surname = "Mur";
            student1.course = 4;
            student1.mat = 4.5;
            student1.econ = 4.0;
            student1.lang = 3.8;

        Lesson4Student student2 = new Lesson4Student(2,"Nika","Sat",1);

            student2.mat = 3.5;
            student2.econ = 3.1;
            student2.lang = 4.0;

        Lesson4Student student3 = new Lesson4Student();


            student3.number = 3;
            student3.name = "Ivan";
            student3.surname = "Izma";
            student3.course = 3;
            student3.mat = 2.5;
            student3.econ = 4.1;
            student3.lang = 3.4;

            StudentTest sTest = new StudentTest();
            sTest.sredneeArifm(student1);
            sTest.sredneeArifm(student2);
            sTest.sredneeArifm(student3);


        }
    }
