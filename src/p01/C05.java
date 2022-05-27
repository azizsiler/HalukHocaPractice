package p01;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
            sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
            sonuç 300 olmalıdır.
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("ehliyetiniz var ise 1 yok ise 0 seciniz");
        int ehliyet= scan.nextInt();
        System.out.println("hızınızı giriniz");
        int hız= scan.nextInt();

        if (ehliyet==1){
            if (hız<0){
                System.out.println("negatif hız olmaz dogru bir veri girinz");

            }else if (hız>=55&&hız<=75){
                System.out.println("cezanız 100 Dolar");
            }else if (hız>=75&&hız<=85){
            System.out.println("cezanız 200 Dolar");
            }else if (hız>=85&&hız<=94){
                System.out.println("cezanız 300 Dolar");
            }else if (hız>95) {
                System.out.println("cezanız 500 Dolar");
            }else System.out.println("normal hızda seyahat ediyorsunuz");


        }else if (ehliyet==0){
            if (hız<0){
                System.out.println("negatif hız olmaz dogru bir veri girinz");

            }else if (hız>=55&&hız<=75){
                System.out.println("cezanız 300 Dolar");
            }else if (hız>=75&&hız<=85){
                System.out.println("cezanız 400 Dolar");
            }else if (hız>=85&&hız<=94){
                System.out.println("cezanız 500 Dolar");
            }else if (hız>95) {
                System.out.println("cezanız 700 Dolar");
            }else System.out.println("normal hızda seyahat ediyorsunuz ancak ehliyet olmadıgı için cezanız 200 Dolar");

        }else
            System.out.println("lütfen gecerli bir deger giriniz");


    }
}
