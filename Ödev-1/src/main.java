import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner endex =new Scanner(System.in);
        double len,weg;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz ");
        len= endex.nextDouble();
        System.out.println("Lütfen kilonuzu (kg cinsinde) giriniz : ");
        weg= endex.nextDouble();

        double vke= weg/(len*len);

        System.out.println("Vücut Kitle İndeksiniz :"+vke);
        System.out.format("%.2f", vke);
    }
}
