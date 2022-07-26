import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n! =1*2*3*4*5*.....*n

        Scanner scan= new Scanner(System.in);
        System.out.println("Kombinasyon C(n,r) sayısından n'yi giriniz:");
        int n = scan.nextInt();
        System.out.println("Kombinasyon C(n,r) sayısından r'yi  giriniz:");
        int r = scan.nextInt();

        int totaln=1;
        int totalr=1;
        int totalnr=1;
        for(int i=1; i <= n; i++ ){
            totaln=totaln*i;
        }
        for(int i=1; i <= r; i++ ){
            totalr=totalr*i;
        }
        for(int i=1; i <= (n-r); i++ ){
            totalnr=totalnr*i;
        }
        int son=totaln/(totalr*totalnr);
        System.out.println(son);
    }
}
