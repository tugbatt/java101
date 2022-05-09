import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x;
        // x= sıcaklık değeri
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklık değerini giriniz: ");
        x = input.nextInt();
        if (x<5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (x >= 5 && x <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
        }else if (x > 15 && x <= 25) {
            System.out.println("Piknik yapabilirsin.");
        }else if (x>25){
        System.out.println("Yüzmeye gidebilirsin.");
    }
}
}

