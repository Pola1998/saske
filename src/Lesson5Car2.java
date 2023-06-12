public class Lesson5Car2 {
    Lesson5Car2(String cvet, String motor) {
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: "+color+" мотор машины:"+engine);
    }
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed+=skorost;
        return speed;
    }
    int tormoz(int skorost) {
        speed-=skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Cvet: " + color + " motor:  " + engine + " skorost: " + speed );
    }

}
class Lesson5Car2Test{
    public static void main(String[] args) {
        Lesson5Car2 c1 = new Lesson5Car2("yellow", "v4");
        c1.color = "white";
        c1.engine = "v6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();

        Lesson5Car2 c2 = new Lesson5Car2("black", "v8");
        Lesson5Car2 c3 = new Lesson5Car2("White", "v6");

    }


}