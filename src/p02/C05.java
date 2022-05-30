package p02;

import java.util.Scanner;

public class C05 {
    static int bolen=0;
    static boolean asalMı;

    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        int sayı=scan.nextInt();

        asalCarpan(sayı);{

        }
    }

    private static void asalCarpan(int sayı) {

        for (int i = 2; i <=sayı ; i++) {
            if (sayı%i==0){
               bolen=i;

               asalMı(bolen);
            }

        }

    }

    private static boolean asalMı(int bolen) {

        for (int i = 0; i < bolen; i++) {

            if (bolen!=0){
                asalMı=false;
                break;
            }

        }

        return asalMı;
    }


}
