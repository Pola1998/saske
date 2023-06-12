public class Lesson4BA {
    int id;
    String name;
    double balance;

    double popolnenie(double sum) {
        balance += sum;
        return balance;
    }

    double spisanie(double sum) {
        balance -= sum;
        return balance;
    }

    void showInfo() {
        System.out.println("id: " + id + " Imya:  " + name + " balans: " + balance);
    }
}

class BankAccount {
    public static void main(String[] args) {
        Lesson4BA MyAccount = new Lesson4BA();
        Lesson4BA YourAccount = new Lesson4BA();
        Lesson4BA HisAccount = new Lesson4BA();

        MyAccount.id = 1;
        MyAccount.name = "Serg";
        MyAccount.balance = 12.5;

        MyAccount.showInfo();
        MyAccount.popolnenie(5.0);
        MyAccount.showInfo();
        MyAccount.spisanie(11.5);
        MyAccount.showInfo();

        YourAccount.id = 2;
        YourAccount.name = "Nika";
        YourAccount.balance = 2.0;

        HisAccount.id = 3;
        HisAccount.name = "ivan";
        HisAccount.balance = 124.12;
    }
}