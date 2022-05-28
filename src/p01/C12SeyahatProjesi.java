package p01;

import java.util.Scanner;

public class C12SeyahatProjesi {
    public static void main(String[] args) {
           /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
        todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
         İşlemlerde direkt bunları cağırabilirsiniz.
        todo İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
         todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.
      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
        todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("***Seyahat acentemize hoşgeldiniz***");
        System.out.println("Adanan 60Km Mersin 80 km her 20 km başına 5 tl ödenmektedir");
        System.out.println("Nereye yolculuk etmek istiyorsunuz");

        String hedef=scan.next().toUpperCase();
        int toplamBakiye=100;
        int adanaUcret=(60/20)*5;
        int mersinUcret=(80/20)*5;

        int kişi=scan.nextInt();
        int kişi1= scan.nextInt();


        switch (hedef){

            case "ADANA":
                System.out.println("Adanaya gitmeği tercih ettiniz uol ücretiniz"+adanaUcret);
                System.out.println("kaç kişi seyahat edeceksiniz");

                switch (kişi){
                    case 1:
                        System.out.println("Adanaya 1 kişilik  bilet tutarınız :"
                                +adanaUcret+ "kalan bakiyeniz :"+ (toplamBakiye-=adanaUcret));
                        break;
                    case 2:
                        System.out.println("Adana'ya iki kişilik bilet tutarınız"+(adanaUcret*2)
                                +"kalan bakiyeniz :"+ (toplamBakiye-(adanaUcret*2)) );
                        break;
                    default:
                        System.out.println("hatalı giriş yaptınız");

                }
            default:
                System.out.println("dogru bir veri girmelisiniz");
                break;

            case "MERSİN":
                System.out.println("Mersine gitmeği tercih ettiniz top ücretiniz"+mersinUcret);
                System.out.println("kaç kişi seyahat edeceksiniz");

                switch (kişi1){
                    case 1:
                        System.out.println("Mersine 1 kişilik  bilet tutarınız :"
                                +mersinUcret+ "kalan bakiyeniz :"+ (toplamBakiye-=mersinUcret));
                        break;
                    case 2:
                        System.out.println("Mersine iki kişilik bilet tutarınız"+(mersinUcret*2)
                                +"kalan bakiyeniz :"+ (toplamBakiye-(mersinUcret*2)) );
                        break;
                    default:
                        System.out.println("hatalı giriş yaptınız");

                }

        }

    }
}
