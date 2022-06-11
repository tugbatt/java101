import java.util.Scanner;

public class Ayil {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl bilgisini giriniz:");
        yil = input.nextInt();

        if (yil > 0) {
            System.out.println();
        } else {
            System.out.println("Yıl bilgisini hatalı girdiniz!");
            System.exit(0);
        }


        if (yil % 4 == 0 && yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yil değildir.");
            }
        } else if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}