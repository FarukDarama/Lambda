import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03_Tekrar {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trilece","guvec","havucDilimi","kokorec","küşleme","arabAşı","waffle","künefe","guvec"));
        AlfBykTekrarsiz(menu);
        System.out.println();
        chrSayiTersSiraliTekrarsiz(menu);
        System.out.println();
        elChrSayigöreKcktenByge(menu);
        System.out.println();
        chrSayisi7denAzKontol(menu);
        System.out.println();
        wIleBaslayanEleman(menu);



    }
    // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void AlfBykTekrarsiz(List<String> menu ){
        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct().
                forEach(Lambda01::yazdirString);
    }
    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrSayiTersSiraliTekrarsiz(List<String> menu ){
        menu.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::yazdir);
    }
    // Task-3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void elChrSayigöreKcktenByge(List<String> menu ){
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Lambda01::yazdirString);
    }
    // Task-4 : List elemalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void chrSayisi7denAzKontol(List<String> menu ){
      String sonuc =  menu.
              stream().
              allMatch(t-> t.length()<=7) ? "tüm elemanlar 7 karakterden az" : "elemanlar arasında 7 karakterden fazla elemanlı var ";
        System.out.println(sonuc);
    }
    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIleBaslayanEleman(List<String> menu ){
     String sonuc =   menu.
             stream().
             noneMatch(t-> t.startsWith("w")) ? "w ile baslayan kelime yok" : "w ile baslayan kelimeler var";
        System.out.println(sonuc);
    }



}
