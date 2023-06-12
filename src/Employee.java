public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    double boostsalary(double kef) {
        salary *= kef;
        return salary;
    }

    void showInfo() {
        System.out.println("id: " + id + " familiya:  " + surname + " vozrost: " + age + " zp: " + salary + " Cex: " + department);
    }


}
class EmployeeTest{
    public static void main(String[] args) {

    Employee e1 = new Employee();
    e1.id = 1;
    e1.surname = "Muratov";
    e1.age  = 21;
    e1. salary = 62.5;
    e1.department = "PKG";


    Employee e2 = new Employee();
    e2.id = 2;
    e2.surname = "Seltcov";
    e2.age  = 32;
    e2.salary = 58.5;
    e2.department = "PKG";


    e1.showInfo();
    e1.boostsalary(2);
    e1.showInfo();

    e2.showInfo();
    e2.boostsalary(2.1);
    e2.showInfo();

    }

}
