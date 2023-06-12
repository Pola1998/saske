public class Lesson5Human {
    String name;
    Car3 car;
    BankAcc ba;
    void info() {
        System.out.println("imya: "+ name+ "; cvet mashini: "+ car.color+ "; balans bankovskogo scheta: "+ ba.balance);
    }


}

class HumanTest{
    public static void main(String[] args) {
        Lesson5Human h = new Lesson5Human();
        h.name = "David";
        h.car = new Car3("red", "v8");
        h.ba = new BankAcc(18,200.5);
        h.info();

    }

}
class Car3{
    Car3 (String c, String e) {
        color=c;
        engine=e;
    }
    String color;
    String engine;

}
class BankAcc{
    BankAcc(int id2,double balance2){
        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}
