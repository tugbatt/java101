import java.util.Scanner;



public class main {
    public static void main(String[] args) {

        Scanner sayı = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayı1=sayı.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayı2=sayı.nextInt();
        System.out.println("****Seçtiğiniz işlemin sayı değerini giriniz***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");
        System.out.print("Seçimininizi giriniz: ");
        int choose = sayı.nextInt();
        switch (choose){
            case 1:
                System.out.println("Toplama işlemi sonucunuz="+(sayı1+sayı2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucunuz="+(sayı1-sayı2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucunuz="+(sayı1*sayı2));
                break;
            case 4:
                System.out.println("Çıkarma işlemi sonucunuz="+((float)sayı1/sayı2));
                break;
            default:
                System.out.println("Yanlış değer girdiniz:(Tekrar deneyiniz.");
                break;
        }
    }
}