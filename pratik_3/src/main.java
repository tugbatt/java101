import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double a,b,c,d,e,u;
        Scanner hipotenüs = new Scanner (System.in);

      /*üçgenin dik kenarları a,b hipotenüsü c değişkeni olarak tanımlanmıştır.*/

        System.out.println ("Üçgenin birinci kenar uzunluğunu giriniz");
        a = hipotenüs.nextDouble();
        System.out.println ("Üçgenin ikinci kenar uzunluğunu giriniz");
        b = hipotenüs.nextDouble();
        c=Math.sqrt(a*a+b*b);
        d=a+b+c;
        u=d/2;
        e=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println ("A kenarı" +a);
        System.out.println ("B kenarı" +b);
        System.out.println ("Üçgenin hipotenüs uzunluğu =" +c);
        System.out.println ("Üçgenin çevresi =" +d);
        System.out.println ("Üçgenin alanı = " +e);
    }

}
