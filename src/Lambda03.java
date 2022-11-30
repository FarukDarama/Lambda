import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
    List<String> menu = new ArrayList<>(Arrays.asList("trilece","guvec","havucDilimi","kokorec","küşleme","arabAşı","waffle","künefe","guvec"));
        alfBykTekrsz(menu);//Burdaki menu argümandır
        System.out.println();
        chrSayisiTersSiraliUnique(menu);
        System.out.println();
        chrSayisiBykSirali(menu);
        System.out.println();
        harfSayisi7denAzKontrol(menu);
        System.out.println();
        wileBaslayaKontrol(menu);
        System.out.println();
        xileBaslayanKontrol(menu);
        System.out.println();
        chrSayisiEnBuyukElemanPrint(menu);
        ilkElHrcSonHrfSiraliPrint(menu);



    }
    // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static  void alfBykTekrsz(List<String>  yemek){//burdaki yemek parametre
       yemek.
               stream().//akış basladı
               map(String::toUpperCase).//Buyuk Harf
               sorted().//Dogal sıralandı
               distinct().//Elemanların tekrarsiz olmasını sagladı
               forEach(t-> System.out.print(t+" "));
    }
    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static  void chrSayisiTersSiraliUnique(List<String>  yemek){//burdaki yemek parametre
        yemek.
                stream().//akıs alındı
                map(String::length).//akısı guncelledim kelimelerin uzunlugu olarak
                sorted(Comparator.reverseOrder()).//ters sorted yaptım
                distinct().// tekrarsızları aldım
                forEach(Lambda01::yazdir);//yazdır
    }
    // Task-3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static  void chrSayisiBykSirali(List<String>  yemek){//burdaki yemek parametre
        yemek.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Lambda01::yazdirString);//yazdır
    }
    // ******************************************************************************************
    // *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //*******************************************************************************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task-4 : List elemalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void harfSayisi7denAzKontrol(List<String>  yemek){
        String sonuc = yemek.
                stream().
                allMatch(t -> t.length() <= 7) ? "List elemanları 7 ve daha az harftrn olusuyor" :
                "List elemları 7 harfden buyuk";
        System.out.println(sonuc);
    }

    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wileBaslayaKontrol(List<String>  yemek){
             String sonuc= yemek.
                stream().
                noneMatch(t -> t.startsWith("w")) ? "w ile yemek ismi mi olur" :
                "w ile yemek icat ettik";
               System.out.println(sonuc);
    }
    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

     public static void xileBaslayanKontrol(List<String>  yemek){
       String sonuc = yemek.
               stream().
               anyMatch(t-> t.endsWith("x")) ? "masallah" : "x ile biten yemek mi olur";
         System.out.println(sonuc);
     }
    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void chrSayisiEnBuyukElemanPrint(List<String>  yemek){
        Stream<String> sonİsim =  yemek.stream()
        .sorted(Comparator.comparing(t-> t.toString().length()).
        reversed()).//karakter sayısına göre tersten sıralama
        limit(1);//limit methodu kullanılarak ilk eleman cagrıldı

        System.out.println(Arrays.toString(sonİsim.toArray()));

    }
    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void ilkElHrcSonHrfSiraliPrint(List<String>  yemek){
        yemek.
                stream().
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).//sonharfe göre alfabetik sıralandı
                skip(1).//akısdaki ilk eleman haric tutuldu(girilen sayi kadar hariç tutar)
                forEach(Lambda01::yazdirString);//yazdırdı
    }



}
