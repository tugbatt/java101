import java.util.Scanner;

public class bol {
    public static void main(String[] args) {
        // k= kullanıcıdan alınan kontrol edilmeye devam edilecek üst sayı limiti.
        //counter= k'ya kadar kaç adet sayının kontrol edildiğinin bilgisini tutacak.
        //total=3 ve 4'e bölünen sayıların toplamını tutacak.
        //x= şartı sağlayan sayıların ortalaması.

        Scanner inp = new Scanner(System.in);
        System.out.println("Üst sınır sayısını giriniz:");
        int k = inp.nextInt();
        int total = 0;
        int counter = 0;

        for (int i = 1; i < k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                counter++;
            }
        }
        double x = total / counter;
            System.out.println("Şartı sağlayan değerlerin ortalaması:" + x);
        }
    }
