import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int userDay;
        String userMonth,horoscope=" ";
        boolean dayError=false,monthError=false;

        System.out.print("Doğduğunuz Ay:");
        userMonth=input.nextLine();
        System.out.print(" Doğduğunuz Gün:");
        userDay=input.nextInt();

        if(userMonth.equalsIgnoreCase("ocak")){

            if(userDay>0 && userDay<32){

                if(userDay<22){
                    horoscope="Oglak";
                }
                else{
                    horoscope="Kova";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("subat")){

            if(userDay>0 && userDay<29){

                if(userDay<20){
                    horoscope="Kova";
                }
                else{
                    horoscope="Balık";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("mart")){

            if(userDay>0 && userDay<32){

                if(userDay<21){
                    horoscope="Balık";
                }
                else{
                    horoscope="Koc";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("nisan")){

            if(userDay>0 && userDay<31){

                if(userDay<21){
                    horoscope="Koc";
                }
                else{
                    horoscope="Boga";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("mayis")){

            if(userDay>0 && userDay<32){

                if(userDay<22){
                    horoscope="Boga";
                }
                else{
                    horoscope="Ikizler";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("haziran")){

            if(userDay>0 && userDay<31){

                if(userDay<22){
                    horoscope="Ikizler";
                }
                else{
                    horoscope="Yengec";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("temmuz")){

            if(userDay>0 && userDay<32){

                if(userDay<23){
                    horoscope="Yengec";
                }
                else{
                    horoscope="Aslan";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("agustos")){

            if(userDay>0 && userDay<32){

                if(userDay<23){
                    horoscope="Aslan";
                }
                else{
                    horoscope="Basak";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("eylul")){

            if(userDay>0 && userDay<31){

                if(userDay<23){
                    horoscope="Basak";
                }
                else{
                    horoscope="Terazi";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("ekim")){

            if(userDay>0 && userDay<32){

                if(userDay<23){
                    horoscope="Terazi";
                }
                else{
                    horoscope="Akrep";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("kasim")){

            if(userDay>0 && userDay<31){

                if(userDay<22){
                    horoscope="Akrep";
                }
                else{
                    horoscope="Yay";
                }
            }
            else {
                dayError=true;
            }
        }
        else if(userMonth.equalsIgnoreCase("aralik")){

            if(userDay>0 && userDay<32){

                if(userDay<22){
                    horoscope="Yay";
                }
                else{
                    horoscope="Oglak";
                }
            }
            else {
                dayError=true;
            }
        }
        else {
            monthError=true;
        }

        if(dayError || monthError){
            System.out.println("Girdiğiniz bilgilerde hata bulunmaktadır.\nBilgilerinizi kontrol ediniz.");
        }
        else {
            System.out.println("Burcunuz :"+horoscope);
        }

    }
}

      /* int month, day;
        String burc = "";
        boolean isEror = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) ;
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            {
                isEror = true;
            }
            break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 20) ;
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            {
                isEror = true;
            }
            break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) ;
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            {
                isEror = true;
            }
            break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 20) ;
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            {
                isEror = true;
            }
            break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 20) ;
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            {
                isEror = true;
            }
            break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 20) ;
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            {
                isEror = true;
            }
            break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 20) ;
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            {
                isEror = true;
            }
            break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 20) ;
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            {
                isEror = true;
            }
            break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 20) ;
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            {
                isEror = true;
            }
            break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 20) ;
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            {
                isEror = true;
            }
            break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 20) ;
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            {
                isEror = true;
            }
            default:
        }
        if (isEror) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        }else{
            System.out.println("Merhaba, burcunuz:" + burc);
        }
    }
}*/

