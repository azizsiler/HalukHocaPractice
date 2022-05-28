package p01;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
        // girilen bir ay numarasına göre ayın kac gün oldugunu yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("bir ay numarası giriniz");

        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen aylar 31 gün çeker");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen aylar 30 gün ceker");
                break;
            case 2:

                System.out.println("bulundugunuz yılı yazınız");
            int yıl=scan.nextInt();


                if (yıl%4==0){
                    System.out.println("girilen ay 29 gün ceker");
                }else{
                    System.out.println("girilen ay 28 gün ceker");
                }break;

            default:
                System.out.println("dogru bir yıl giriniz");









        }
    }
}
