import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double Km,Kmb,Top,durum1,durum2,perkm;
        Scanner taksi = new Scanner(System.in);
        System.out.println("Mesafenin km değerini yazınız =" );
        Km = taksi.nextDouble();
        Kmb= 2.20;
        perkm= Km*Kmb;
                durum1= 10 + 20;
                durum2= 10 +perkm;

                Top = (perkm>20)? durum2 : durum1;
                System.out.println(Top);

    }
}

