import java.util.Scanner;

public class kuv {
    public static void main(String[] args) {
        int n;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz:");
        n = input1.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        int m;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz:");
        m = input2.nextInt();
        for (int i = 1; i <= m; i *= 5) {
            System.out.println(i);
        }
    }
}
