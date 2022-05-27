package p01;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız kordinat noktasını hangi bölgede oldugunu yazdıran
        // bir kod yazınız

        Scanner scan=new Scanner(System.in);
        System.out.print("x ve y degerlerini giriniz");
        int x=scan.nextInt();
        int y= scan.nextInt();

        if (x>0&&y>0){
            System.out.println("girdiginiz deger 1. bolgede");
        }else if (x<0&&y>0){
            System.out.println("girdiginiz deger 2. bolgede");
        }else if (x<0&&y<0) {
            System.out.println("girdiginiz deger 3. bolgede");
        }
        else if (x>0&&y>0) {
            System.out.println("girdiginiz deger 4. bolgede");
        }else if (x!=0&&y==0) {
            System.out.println("girdiginiz deger x ekseni. bolgede");
        }else if (x==0&&y!=0) {
            System.out.println("girdiginiz deger y. exseni bolgede");
        }else {
            System.out.println("girdiginiz degerler orijin üxrinde");
        }
    }
}
