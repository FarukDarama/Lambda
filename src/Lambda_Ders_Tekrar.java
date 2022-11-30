import java.util.*;
import java.util.stream.IntStream;

public class Lambda_Ders_Tekrar {
    //Diziler doğrudan Lambda'da kullanılamaz, ancak listeyi dönüştürdükten sonra kullanabilirsiniz
    int a[] = {12, 9, 13, 5, 8};
//Konsolda 3'ten 10'a kadar tamsayılar nasıl yazdırılır
//3 ile 10 arasındaki tam sayıların toplamı nasıl bulunur
//9 faktöriyel nasıl bulunur
//6 ile 100 arasındaki tek tam sayıların toplamı nasıl bulunur
//İlk 5 çift sayının çarpımı nasıl bulunur
//4'ten büyük 6 tek tam sayının çarpımı nasıl bulunur

    public static void main(String[] args) {
        //Diziler doğrudan Lambda'da kullanılamaz, ancak listeyi dönüştürdükten sonra kullanabilirsiniz
        int a[] = {12, 9, 13, 5, 8};
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 9, 13, 5, 8));
        ucdenOna(list);
        System.out.println();
        System.out.println(ucOnArasıTopla(list));
        System.out.println(faktoriyel(5));
        System.out.println(toplam(6, 100));
        System.out.println(carpim(5));
        System.out.println(altıBykTamSayi(6));


    }

    public static void ucdenOna(  List<Integer> list ){
        list.
                stream().
                filter(t-> t>3 && t<10).
                forEach(Lambda01::yazdir);
    }
    //3 ile 10 arasındaki tam sayıların toplamı nasıl bulunur
    public static Optional<Integer> ucOnArasıTopla(List<Integer> list ){

   Optional<Integer> toplam=
                list.
                stream().
                filter(t-> t>3 && t<10).
                reduce(Integer::sum);
               return toplam;
    }
    //9 faktöriyel nasıl bulunur
    public static int faktoriyel(int a){
     return    IntStream.
             rangeClosed(1,a).
             reduce(1,(t,b) -> t*b);

    }
    //6 ile 100 arasındaki tek tam sayıların toplamı nasıl bulunur
    public static int toplam(int a,int b){
        return    IntStream.

                rangeClosed(a,b).
                filter(t->t%2!=0).sum();

    }
    //İlk 5 çift sayının çarpımı nasıl bulunur
    public static OptionalInt carpim(int a){
        return    IntStream.
                 iterate(2,t-> t+2).
                 limit(a).
                 reduce(Math::multiplyExact);

    }
    public static int carpim1(int a){
        return    IntStream.
                iterate(2,t-> t+2).
                limit(a).
                reduce(1,(t,x)->t*x);

    }
    //4'ten büyük 6 tek tam sayının çarpımı nasıl bulunur


    public static int altıBykTamSayi(int a){
     return  IntStream.
             iterate(5,t->t+2).
             limit(a).
             reduce(1,(t,x)->t*x);
    }
}
