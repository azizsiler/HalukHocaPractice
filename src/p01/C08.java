package p01;


import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("pozitif 3 tamsayı giriniz");
        int sayı=scan.nextInt();

        String sonucDegeri=(sayı>99&&sayı<1000)?("uc basamaklı sayı"):
                (sayı%2==0? "uc basamaklı cift sayı":"uc basamaklı tek sayı");
        System.out.println(sonucDegeri);
    }
}
