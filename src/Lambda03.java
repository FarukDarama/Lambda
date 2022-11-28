import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
    List<String> menu = new ArrayList<>(Arrays.asList("trilece","havucDilim","guvec","kokorec","küşleme","arabAşı","waffle","künefe","guvec"));
     alfBykTekrsz(menu);//Burdaki menu argümandır



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


}
