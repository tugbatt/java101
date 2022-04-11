import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* para degeri = p, kdv= kdv tutarı */

        Scanner input = new Scanner(System.in);
        double para,kdvli,kdvtut;

        System.out.println("Para tutarını giriniz :");
        para = input.nextDouble();
        boolean durum1 = para < 1000;
        boolean durum2 = para > 0;
        boolean durum3 = (durum1 && durum2);
        double kdv = (durum3) ? 0.18 :0.08;
        kdvli= para+(para*kdv);
        kdvtut=para*kdv;
        System.out.println("Para tutarınız :"+para);
        System.out.println("Kdv'sız fiyat :"+para);
        System.out.println("Kdv oranı :"+kdv);
        System.out.println("Kdv'li fiyat :"+kdvli);
        System.out.println("Kdv tutarı :"+kdvtut);


    }
}