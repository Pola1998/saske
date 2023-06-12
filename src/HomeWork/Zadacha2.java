package HomeWork;

public class Zadacha2 {
    static final double pi = 3.14;

    public double ploshad(double radius) {
        double p1 = pi * radius * radius;
        return p1;
    }

    public static double dlina(double radius2) {
        double d1 = 2 * pi * radius2;
        return d1;
    }

    public void Info(double radius3) {
        System.out.println("Radius " + radius3);
        System.out.println("Ploshad kruga " + ploshad(radius3));
        System.out.println("Dlina okrujnosti " + dlina(radius3));
    }
}
class Zadacha2Tesat{
    public static void main(String[] args) {
        Zadacha2 z= new Zadacha2();
        z.ploshad(5);
        Zadacha2.dlina(7.5);//оба способа верны
        z.Info(3);

    }
}

