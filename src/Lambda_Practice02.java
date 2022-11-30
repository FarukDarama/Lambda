import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Practice02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Elma");
        list.add("portakal");
        list.add("uzum");
        list.add("cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("elma");
        list.add("keciboynuzu");
        list.add("Ayva");

        System.out.println("ilkHarfBykGerisiKckList(list) = " + ilkHarfBykGerisiKckList(list));
        System.out.println("ecIleBaslayanList(list) = " + ecIleBaslayanList(list));
        yildizliYaz(list);
    }

    //S1: list elemanlarını ilk harf buyuk gerisi kucuk sekılde listeleyelim
    public static List<String> ilkHarfBykGerisiKckList(List<String>l){
        return
                l.stream().
                        map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                        collect(Collectors.toList());
    }
    // S2: ilk harfi e ve ya c olanlari listeleyelim
    public static List<String> ecIleBaslayanList(List<String>liste){
        return
                liste.stream().
                        filter(t->t.toLowerCase().startsWith("e") || t.toLowerCase().startsWith("c")).
                        collect(Collectors.toList());
    }
    //S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizliYaz(List<String>liste){
        liste.
                stream().
                map(t->"*"+t+"*").forEach(Utils::yazString);

    }

}

