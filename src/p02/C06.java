package p02;

import java.util.Scanner;

public class C06 {



    public static void main(String[] args) {
        /*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("cevirim yapacağınız işlemi seciniz");

        String islem= scan.next();

        System.out.println("bir miktar giriniz");
        double miktar= scan.nextDouble();

        cevirmeMethodu(islem, miktar);{

        }





    }

    private static void cevirmeMethodu(String islem, double miktar) {

        switch (islem){
            case "saat":
                System.out.print(miktar*60*60);
                break;
            case "mil":
                System.out.println((miktar*1.62));
                break;
            case "kg":
                System.out.println(miktar*1000);
                break;
            default:
                System.out.println("uynun bir veri giriniz");
        }
    }
}
