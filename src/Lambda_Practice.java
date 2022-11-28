import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Practice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        //S2: sadece negatif olanlari yazdir
        negatifYaz(list);
        System.out.println();
        System.out.println("***************");
        ciftYaz(list);

        //S4:pozitif ve çift olanları yazdırın

        System.out.println();
        ciftPozYaz(list);
        //S5:pozitif veya çift olanları yazdırın
        System.out.println();
        ciftveyaPozYaz(list);
        System.out.println();
        // S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım
        kareYazdır(list);
        System.out.println();
        ciftKupYazdır(list);
        System.out.println();
        //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
        kareTekrarsiz(list);
        System.out.println();
        //S9: listin elemanlarini kucukten buyuge siralayalim
        elemanlarıSırala(list);
        System.out.println();
        //S10: listin elemanlarini buyukten kucuge siralayalim
        elemanlarıTersSırala(list);
        System.out.println();
        //S12: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        System.out.println(pozKareSon5degilList(list));
        System.out.println();
        // S13 :list elemanlarini toplamini bulalim
        System.out.println(elemanlariTopla(list));
        System.out.println();
        System.out.println(elemanlariToplaRefence(list));
        System.out.println(elemanlariToplaRefenceInt(list));
        //S14 : Listin pozitif elemanları toplamını bulalım
        pozElemanTop(list);



    }

    public static void negatifYaz(List<Integer> k){
        k.stream().filter(t-> t<0).forEach(t-> System.out.print(t));
    }
    public static void ciftYaz(List<Integer> k){
        k.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
    }
    public static void ciftPozYaz(List<Integer> k){
        k.stream().filter(t-> t%2==0 && t>0).forEach(t-> System.out.print(t+" "));
    }

    public static void ciftveyaPozYaz(List<Integer> k){
        k.stream().filter(t-> t%2==0 || t>0).forEach(t-> System.out.print(t+" "));
    }

    public static void kareYazdır(List<Integer> k){
        k.stream().map(t-> t*t).forEach(t-> System.out.print(t+" "));
    }
    public static void ciftKupYazdır(List<Integer> k){
        k.stream().filter(t-> t%2==0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }
    public static void kareTekrarsiz(List<Integer> k){
        k.stream().map(t-> t*t).distinct().forEach(t-> System.out.print(t+" "));
    }
    public static void elemanlarıSırala(List<Integer> k){
        k.stream().sorted().forEach(t-> System.out.print(t+" "));
    }
    public static void elemanlarıTersSırala(List<Integer> k){
        k.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }
    public static List<Integer> pozKareSon5degilList(List<Integer> k){
     List<Integer> list = k.stream().filter(t-> t>0).map(t-> t*t).filter(t-> t%10!=5).collect(Collectors.toList());
     return list;
    }
    public static int elemanlariTopla(List<Integer> k){
     int toplam =   k.stream().reduce(0,(x,y)->x+y);
     return toplam;
    }
    public static int elemanlariToplaRefence(List<Integer> k){
        int toplam =   k.stream().reduce(0,Math::addExact);
        return toplam;
    }
    public static int elemanlariToplaRefenceInt(List<Integer> k){
        int toplam =   k.stream().reduce(0,Integer::sum);
        return toplam;
    }
    //S14 : Listin pozitif elemanları toplamını bulalım

    public static void pozElemanTop(List<Integer> k){
        System.out.println(k.stream().filter(t -> t > 0).reduce(0, Integer::sum));
    }


}
