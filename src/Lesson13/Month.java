package Lesson13;

public class Month {
    int numMonth;
   public Month (int numMonth){
        this.numMonth = numMonth;
    }


    public static void main(String[] args) {
        Month m = new Month(3);
        switch (m.numMonth){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("v mesyace 30 den");
                break;
            case 2:
                System.out.println("v mesyace 28 dney");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("v mesyace 31 den");
                break;
            default:
                System.out.println("net takogo mesyaca");
        }


    }
}
