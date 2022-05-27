package p01;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //kullanıcıdan boyunu ve kılosunu alın vucut kıtle indexini hesaplayınız

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu gırınız");

        double boy= scan.nextDouble();
        System.out.println("kilonuzu gırınız");
        double kilo= scan.nextDouble();

        double kutleEndekxi=kilo/(boy*boy);

        if (kutleEndekxi<=20){
            System.out.println("cok zayıfsınız");
        }
        else if (kutleEndekxi>20 &&kutleEndekxi<=25){
            System.out.println("normalsiniz");

        }else if (kutleEndekxi<35 &&kutleEndekxi>25){
            System.out.println("sismansınzı");
        }else if (kutleEndekxi>35){
            System.out.println("obezsiniz");
        }else System.out.println("dogru bir veri girinzi");





    }
}
