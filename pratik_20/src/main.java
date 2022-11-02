import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Bir sayının basamak sayılarının toplamını bulan program
        // Örnek : 1643 = 1+6+4++3 =14
        int number;
        int value;
        int total=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        while (number != 0){
        value = number % 10;
        total += value;
        number /= 10;
    }
    System.out.println(total);
        }
    }

