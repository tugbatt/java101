import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.print("üssü alınacak sayı:");
        x= input.nextInt();
        System.out.print("üs olacak sayı:");
        y= input.nextInt();
        int total = 1;
        for(int i=1;i<=y;i++) {
            total *= x;
        }
            System.out.println(total);
        }
    }

