package p02;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfn notunuzu giriniz");
        int not= scan.nextInt();
        System.out.println("Hatf notunuzu giriniz");
      String harfNotu="";
        if (not<50&&not>=0){
            System.out.println("Harf Notunuz D");
        }else if (not>=50&& not<60){
            System.out.println("Harf Notunuz C");
        }else if (not>=60&&not<80){
            System.out.println("Harf Notunuz B");
        }else if (not>=80){
            System.out.println("Harf Notunuz B");
        }else {
            System.out.println("Gecerli not giriniz");
        }


        switch (harfNotu){
            case "D":
                System.out.println("Malesf dersi gecemediniz");break;
            case "C":
                System.out.println("Dersi şartlı geçtiniz");break;
            case "B":
                System.out.println("Dersi başarı ile geçtini");break;
            case "A":
                System.out.println("Dersi çok başarı ile geçtiniz"); break;
            default:
                System.out.println("Gerçerli bir not giriniz");
        }
    }
}
