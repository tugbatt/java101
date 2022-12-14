import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;// deneme sayısı
        int balance = 1500;// başlangıç bakiyesi
        int select;

        while (right > 0) {

            System.out.print(" Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print(" Parolanız :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println(" Merhaba Tuğhan Bank'a Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();

                    switch (select) {
                        case 1: {
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz. ");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz:" + balance);
                            break;
                        }
                        default:
                            System.out.println("");
                            break;
                    }
                }
                while (select != 4);
                System.out.print("Tekrar görüşmek üzere.İyi günler dileriz. ");
                break;
            } else {
                System.out.println("Kullanıcı adı veya şifreniz hatalı tekrar deneyiniz.");
                right--;
                if (right == 0) {
                    System.out.print("Kartınız bloke olmuştur.Lütfen bankanız ile iletişime geçiniz.");
                }
                System.out.println("Kalan hakkınız :" + right);
            }
        }
    }
}
