package p02;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir strin giriniz");

        String str = scan.next();

        ilkIkiHaric(str); {

        }

    }

    private static String ilkIkiHaric(String str) {
        String kalanHarfler = "";

        if (str.startsWith("gh")) {
            kalanHarfler += str;
        } else if (str.startsWith("g")) {
            kalanHarfler += str.charAt(0) + str.substring(2);
        } else if (str.charAt(1) == 'h') {
            kalanHarfler += str.substring(1);
        }


        return kalanHarfler;
    }
}
