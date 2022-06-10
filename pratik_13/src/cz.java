import java.util.Scanner;

public class cz {
    public static void main(String[] args) {
        int birthday = 0, kalan;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        birthday = input.nextInt();

        if (birthday > 0) {
            System.out.println();
        } else {
            System.out.println("Doğum yılınızı hatalı girdiniz.");
            System.exit(0);
        }

        kalan = birthday % 12;
        if (kalan == 0) {
            System.out.println("Çin Zodyağı burcunuz : Maymun");
        } else if (kalan == 1) {
            System.out.println("Çin Zodyağı burcunuz: Horoz");
        } else if (kalan == 2) {
            System.out.println("Çin Zodyağı burcunuz: Köpek");
        } else if (kalan == 3) {
            System.out.println("Çin Zodyağı burcunuz: Domuz");
        } else if (kalan == 4) {
            System.out.println("Çin Zodyağı burcunuz: Fare");
        } else if (kalan == 5) {
            System.out.println("Çin Zodyağı burcunuz: Öküz");
        } else if (kalan == 6) {
            System.out.println("Çin Zodyağı burcunuz: Kaplan");
        } else if (kalan == 7) {
            System.out.println("Çin Zodyağı burcunuz: Tavşan");
        } else if (kalan == 8) {
            System.out.println("Çin Zodyağı burcunuz: Ejderha");
        } else if (kalan == 9) {
            System.out.println("Çin Zodyağı burcunuz: Yılan");
        } else if (kalan == 10) {
            System.out.println("Çin Zodyağı burcunuz: At");
        } else if (kalan == 11) {
            System.out.println("Çin Zodyağı burcunuz: At");
        }
    }
}