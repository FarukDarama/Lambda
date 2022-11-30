import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {
    /*
     TASK :
     fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
    */
    public static void main(String[] args) {
        Universite u01= new Universite("bogazici","matematik",571,93);
        Universite u02= new Universite("istanbul tk","matematik",600,81);
        Universite u03= new Universite("istanbul","hukuk",1400,71);
        Universite u04= new Universite("marmara","bilg muh",1080,77);
        Universite u05= new Universite("odtu","gemi muh",333,74);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
        System.out.println(notOrt74denBuyukUni(unv));
        System.out.println(matVarmi(unv));
        System.out.println(ögrSayıBuyukKucuk(unv));
        System.out.println(matBolumsayisi(unv));
        System.out.println(ogrencisayi550BykMaxNotOrt(unv));
        System.out.println(azOgrenciSay(unv));

    }
    //task 01--> butun universtelerin  notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrt74denBuyukUni(List<Universite> unv ){

      return   unv.
              stream().
              allMatch(t-> t.getNotOrt()>74);
    }
    //task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean matVarmi(List<Universite> unv ){

        return   unv.
                stream().
                anyMatch(t-> t.getBolum().
                equalsIgnoreCase("Matematik"));
    }
    //task 03-->universite'leri ogr sayilarina gore b->k siralayini

    public static List<Universite> ögrSayıBuyukKucuk(List<Universite> unv ){
      return   unv.
              stream().
              sorted(Comparator.comparing(Universite::getOgrSayisi).reversed())//ogrenci sayısına göre tersten sıralandı
              .collect(Collectors.toList());//stream yapısı list e cevirdik

    }
    //task 04-->"matematik" bolumlerinin sayisini  print ediniz.

    public static int matBolumsayisi(List<Universite> unv ){

   return (int) unv.
            stream().
            filter(t-> t.getBolum().
            equalsIgnoreCase("matematik")).//contains de kullanılabilir mat olan unileri sectik
            count();//secilen unileri saydi

    }
    //task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

    public static OptionalInt ogrencisayi550BykMaxNotOrt(List<Universite> unv){
      return   unv.
                stream().
                filter(t-> t.getOgrSayisi()>550).
                mapToInt(t-> t.getNotOrt()).
                max();

    }

    //task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt azOgrenciSay(List<Universite> unv){
       return unv.
               stream().
               filter(t-> t.getOgrSayisi()<1050).mapToInt(Universite::getNotOrt).
               min();
    }


}
