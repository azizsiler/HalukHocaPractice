package p02;

import java.util.Scanner;

public class C03 {
    /* TASK :
     * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
     * Test data: ali eme all
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfn 3 harfli bir isim giriniz");
        String isim=scan.next();

        String s1=isim.substring(0,1);
        String s2=isim.substring(1,2);
        String s3=isim.substring(2,3);

        if (!s1.equals(s2) && !s2.equals(s3) && !s1.equals(s3)){
            System.out.println("bu isim uniquedir");
        }else if (s1.equals(s2) && s2.equals(s3) && s1.equals(s3)) {
            System.out.println("böyle isim olmaz");
        }else {
            System.out.println("bu isim unique degildir");
        }

     //   String result = isim.length() == 3 ? ((s1 != s2 & s1 != s3 && s2 != s3) ? "Girdiginiz isim 3 harfli ve unique karakterle sahip"
        //      : "Girdiginiz isim 3 harfli ancak unique karakterle sahip degil "):"Girdiginiz isim 3 harfli değil";
    }




}
