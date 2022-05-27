package p01;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        // kullanıcıdan alacagı ıkı sayı yine kullaniciya sectirecegimiz
        // dort i;lemden birini koyup sonucu yazdiriniz


        Scanner scan=new Scanner(System.in);
        System.out.println("toplama için 1\n çıkarma icin 2\n carpma icin 3\n bolme icin 4\n ");
        int islem= scan.nextInt();
        System.out.println("lutfen ıkı sayı giriniz");


        int num1=scan.nextInt();
        int num2=scan.nextInt();

        if (islem==1){
            System.out.println(num1+num2);
        }else if (islem==2){
            System.out.println(num1-num2);
        }else if (islem==3){
            System.out.println(num1*num2);
        }else if (islem==4){
            System.out.println(num1/num2);
        }


    }


}
