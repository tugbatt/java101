import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int n = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();
        int sum = (mat + fizik + turkce + kimya + muzik);

        if (!(mat <=100 && mat >= 0)) {
            sum -= mat;
            n--;
        }
        if (!(fizik <= 100 && fizik >= 0)) {
            sum -= fizik;
            n--;
        }
        if (!(turkce <= 100 && turkce >= 0)) {
            sum -= turkce;
            n--;
        }
        if (!(kimya <= 100 && kimya >= 0)) {
            sum -= kimya;
            n--;
        }
        if (!(muzik <= 100 && muzik >= 0)) {
            sum -= muzik;
            n--;
        }
        if (n > 0) {
            double average = (sum / n);

            if (average <= 55) {
                System.out.println("Sınıfta kaldınız.Seneye görüşürüz:)");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız = " + average);

        }else{
            System.out.println("Not ortalamanız 0'dan küçük ve 100'den büyük olamayacağı için hesaplanmadı.");
        }
    }
}
