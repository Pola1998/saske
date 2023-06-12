package E;

public class Lesson6Emp {

    public Lesson6Emp(int id2, String surname2, int age2) {
     id = id2;
     surname = surname2;
     age = age2;
    }

    public  Lesson6Emp(String surname3,int age3){
        surname = surname3;
        age = age3;
    }

    public Lesson6Emp(int id4, String surname4, int age4, double salary4, String department4) {
        this (surname4,age4);// вызывает второй конструктор
        id = id4;
        salary = salary4;
        department = department4;
    }
    int id;
    public String surname;
    int age;
    private double salary;
    String department;
}
class Lesson6EmpTest{
    public static void main(String[] args) {
        Lesson6Emp emp1 = new Lesson6Emp(1,"ivanov",25);

        System.out.println(emp1.id);
        Lesson6Emp emp2 = new Lesson6Emp("Petrov",30);
        System.out.println(emp2.department);
        Lesson6Emp emp3 = new Lesson6Emp(3,"Petrov",30, 100.35, "IT");
        System.out.println(emp3.department);
    }

}
