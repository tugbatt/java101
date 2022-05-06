
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, karar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız ! ");
        } else {
            System.out.println("Bilgileriniz yanlış !");

            if (userName.equals("patika") && !password.equals("java123")) {
                System.out.println("Şifrenizi sıfırlamak ister misiniz? (yes/no)");
                karar = inp.nextLine();
                if (karar.equalsIgnoreCase("yes") || karar.equalsIgnoreCase("y")) {
                    System.out.print("Şifrenizi tekrar giriniz : ");
                    newPassword = inp.nextLine();

                    if (!newPassword.equalsIgnoreCase("java123") && !newPassword.equalsIgnoreCase(password)) {
                        System.out.print("Şifre oluşturuldu.");
                    } else {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                }
            }
        }
    }
}



