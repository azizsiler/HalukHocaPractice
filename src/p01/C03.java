package p01;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*
        kullanıcıdan yasını ve kilosunu alınız
        18 yasındand kucukse bagıs yapamaz
        18 yaından buyulk ve 50 kiloıdan hafif ise kan bagısı yapamaz
        18 yasından buyuk ve 50 kilodan agırsa kan bagısı yapabilir

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("yaşınızı giriniz");
         int yas=scan.nextInt();

        System.out.print("kilonuzu giriniz");
        int kilo=scan.nextInt();

        if (yas>0&&yas<18){
            System.out.println("yası 18 den kucuk olanlar kan bagısı yapamaz");

        }else if (yas>=18){
            if (kilo>0&&kilo<50){
                System.out.println("kilonuz 50 altında oldugu ıcın kan bagısı yapamazsınız");

            }else if (kilo>=50){
                System.out.println("kan bagısı yapabilirsiniz");
            }else {
                System.out.println("dogru veri giriniz");
            }
        }else {
            System.out.println("hatalı veri girrdiniz");
        }
    }
}
