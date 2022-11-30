import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));

        ciftKarePrint(sayi);
        System.out.println("*******************************");
        tekKupPrint(sayi);
        System.out.println("*******************************");
        maxElBul(sayi);
        System.out.println("*******************************");
        ciftMaxKare(sayi);
        System.out.println("*******************************");
        toplamPrint(sayi);
        System.out.println("*******************************");
        ciftElCarp(sayi);
        System.out.println("*******************************");
        minElPrint(sayi);
        System.out.println("*******************************");
        besdenBuyukTekSayi(sayi);
        System.out.println("*******************************");
        ciftElKucuktenBuyugePrint(sayi);
    }

    public static void ciftKarePrint( List<Integer> sayi){
        sayi.stream().filter(Lambda01::ciftBul).//akısdaki cift sayıları filtreledim
                map(t -> t*t).//16,4,36--->Stream icerisindeki elemanları baska degerlere dönüstürdü denilebilir
                forEach(Lambda01::yazdir);
    }
    // Task : Functional Programming ile listin tek elemanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void tekKupPrint( List<Integer> sayi){
        sayi.
                stream().
                filter(t-> t%2!=0).//akısdaki tek sayıları filtreledim
                map(t -> (t*t*t)+1).//-->Stream icerisindeki elemanları baska degerlere dönüstürdü denilebilir
                forEach(Lambda01::yazdir);
    }
    // Task-3 : Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public void ciftKarekok(List<Integer> sayi){
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(Math::sqrt).//double
                forEach(t-> System.out.print(t+" "));

           }
    // Task-4 : list'in en buyuk elemanini yazdiriniz


    public static void   maxElBul(List<Integer> sayi) {
      Optional<Integer> maxSayi =  sayi.
                stream().
                reduce(Math::max);//eger benim resultim tek bir deger ise o zaman reduce(terminal) operatörü kullanılır
        System.out.println(maxSayi);
    }

    // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftMaxKare(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).
                reduce(Integer::max));//Math::max 'a göre daha hızlı çalışır.

    }

    // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    /*
    * a ilk degerini her zaman atanan degerden (ilk parametre) alır,
    bu örnekte 0 oluyor
    * b degerini her zamana  stream()'dan akısdan alır
    * a ilk degerinden sonraki her değeri action(işlem)'dan alır

    */
    public static int toplamPrint(List<Integer> sayi){
       int toplam = sayi.
               stream().
               reduce(0,(a,b)->a+b);

        System.out.println("toplam = " + toplam);
      return toplam;
    }
    // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElCarp(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                reduce(Math::multiplyExact));//method refrance

        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                reduce(1, (a, b) -> (a * b)));//lambda expression

    }
    // Task-8 : List'teki elemanlardan en kucugunu  print ediniz.
    public static void minElPrint(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                reduce(Integer::min));//Math::min de kullanılır ama ınteger daha hızlı
        System.out.println(sayi.
                stream().
                reduce(Lambda02::byMiracMin));

    }
    public static int byMiracMin(int a, int b){
        return a<b ? a : b;
    }

    // Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void besdenBuyukTekSayi(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(t -> t > 5 && t%2!= 0).
                reduce(Lambda02::byMiracMin));

    }
    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftElKucuktenBuyugePrint(List<Integer> sayi){
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t-> t*t).sorted().
                forEach(Lambda01::yazdir);

    }





}

