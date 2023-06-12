package P4;

import P1.A;
import static P1.P2.B.*;
import P1.P2.P3.C;
import P4.P5.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.pa1);
        System.out.println(s);

        C c = new C();
        int ab = c.pc1;
        System.out.println(ab);

        E e = new E();
        System.out.println(e.pe1);
    }
}
