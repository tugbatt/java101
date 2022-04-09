import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /* mat = ma , fizik = f, kimya = k, turkce=t, tarih = ta, müzik=m, Not Ortalaması= o */
        int ma,f,k,t,ta,m;

        System.out.println("matematik sınav sonucunu giriniz :");
        ma = input.nextInt();
        System.out.println("fizik sınav sonucunu giriniz :");
        f = input.nextInt();
        System.out.println("kimya sınav sonucunu giriniz :");
        k = input.nextInt();
        System.out.println("türkçe sınav sonucunu giriniz :");
        t = input.nextInt();
        System.out.println("tarih sınav sonucunu giriniz :");
        ta = input.nextInt();
        System.out.println("müzik sınav sonucunu giriniz :");
        m = input.nextInt();

        int o = ((ma+f+k+t+ta+m)/6);
        boolean sonuc = o>60;

        System.out.println("Not ortalamanız:"+o);

        String gectiKaldi = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(gectiKaldi);
    }
}
