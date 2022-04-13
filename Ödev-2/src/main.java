import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println (
                "Meyveler ve KG Fiyatları\n" +
                "\n" +
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL\n");

        double af=2.14,ef=3.67,df=1.11,mf=0.95,pf=5.00;

        Scanner Armut = new Scanner(System.in);
        int A;
        System.out.println("Kaç Kilo Armut aldınız?");
        A= Armut.nextInt();

        Scanner Elma = new Scanner(System.in);
        int E;
        System.out.println("Kaç Kilo Elma aldınız?");
        E= Elma.nextInt();

        Scanner Domates = new Scanner(System.in);
        int D;
        System.out.println("Kaç Kilo Domates aldınız?");
        D= Domates.nextInt();

        Scanner Muz = new Scanner(System.in);
        int M;
        System.out.println("Kaç Kilo Muz aldınız?");
        M= Muz.nextInt();

        Scanner Patlıcan = new Scanner(System.in);
        int P;
        System.out.println("Kaç Kilo Patlıcan aldınız?");
        P= Patlıcan.nextInt();

       double Total=(A*af+E*ef+D*df+P*pf);

        System.out.println("Armut kg =" +A+ "kg");
        System.out.println("Elma kg =" +E+ "kg");
        System.out.println("Domates kg =" +D+ "kg");
        System.out.println("Patlıcan kg =" +P+ "kg");
        System.out.print("Toplam ödenecek tutar =");
        System.out.format("%.2f", Total);
    }
}
