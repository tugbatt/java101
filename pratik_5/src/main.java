import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int r,a;
        double pi =3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println ("Dairenizin yarıçapını giriniz =");
        r = Integer.parseInt(inp.next());
        System.out.println ("Daire diliminin açısını giriniz =");
        a = Integer.parseInt(inp.next());

        double Çev=2*pi*r;
        double Alan= r*r*pi;
        double Dilim = (pi * (r*r) * a) / 360;

        System.out.println("Dairemizin çevresi =" +Çev);
        System.out.println("Dairemizin alanı =" +Alan);
        System.out.println("Dairemizin dilimi =" +Dilim);
    }
}
