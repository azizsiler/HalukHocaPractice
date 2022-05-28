package p01;

import java.util.Scanner;

public class C11BankamatikProjesi {
     /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("********ZeroBank'a Hoşgeldiniz*******");
         System.out.println("bakiye sorgu için:1\n " +
                 "Para çekme için: 2\n " +
                 "Para yatırmak için: 3\n " +
                 "Çıkış için : 4\n " +
                 "Yapacağınız işlemi seçmek için :5");
        int islem= scan.nextInt();
        int bakiye=1000;

        switch (islem){
            case 1:
                System.out.println("Mevzut bakiyeniz"+bakiye);
                break;
            case 2:
                System.out.println("Çekmek istediğiniz miktarı girin");
                int cekilenMiktar=scan.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("bakiyeniz taelbinizden daha az");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("bakiyenizin güncel hali"+bakiye);
                }
                break;
            case 3:
                System.out.println("Yatırmak istediğiniz miktarı girin");
                int yatırılanMiktar= scan.nextInt();
                bakiye=bakiye+yatırılanMiktar;
                break;
            case 4:
                System.out.println("Çıkış işlemi başarılı yine bekleriz");
                break;
        }

     }
}
