import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int distance, age, type;
        Scanner input = new Scanner(System.in);

//mesafe başı ücret = 0,10TL=mbü
        System.out.println("Mesafe(km cinsinden):");
        distance = input.nextInt();
        if (distance > 0) {
            System.out.println();
        } else {
            System.out.println("Mesafe değerini yanlış girdiniz.");
            System.exit(0);
        }
//yaş ile ilgili kısım
        System.out.println("Yolcunun yaşı:");
        age = input.nextInt();
        if (age > 0) {
            System.out.println();
        } else {
            System.out.println("Yolcunun yaş değerini yanlış girdiniz.");
            System.exit(0);
        }
//yolculuk tipi ile ilgili kısım
        System.out.println("Yolculuk tipiniz seçiniz.\n tek yön=1 & gidiş-dönüş=2 :");
        type = input.nextInt();

        if (type == 1 || type == 2) {
            System.out.println();
        } else {
            System.out.println("Yolculuk tipi bilginizi hatalı girdiniz !\nTüm bilgilerinizi baştan giriniz.");
            System.exit(0);
        }
//indirimsiz tutar hesap kısmı
        float mbü = 0.10f;
        float pay = distance * mbü;

        //Yolculuk tipi gidiş-dönüş seçilince ücret 2 ile çarpıldı.
        if (type == 2) {
            pay = pay * 2;
        }
    //indirimler
        //Yaş
        if (age < 12) {
            pay = pay - (pay * 0.50f);
        } else if (12 < age && age < 24) {
            pay = pay - (pay * 0.10f);
        } else if (age > 65) {
            pay = pay - (pay * 0.20f);
        }
        //Yolculuk tipi
        if (type == 2) {
            pay = pay - (pay * 0.20f);
        }
//Program çıktıları
        System.out.println("Uçak Bileti fiyatınız: " + pay + " TL");

    }
}
