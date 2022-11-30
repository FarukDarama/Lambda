import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kurs {





    public static void main(String[] args) {
        Can_Pojo ogr1 = new Can_Pojo("Java","Kis",64,100);
        Can_Pojo ogr2 = new Can_Pojo("Sql","Kis",76,101);
        Can_Pojo ogr3 = new Can_Pojo("English","Yaz",87,102);
        Can_Pojo ogr4 = new Can_Pojo("Math","SonBahar",96,103);

        List<Can_Pojo> list = new ArrayList<>(Arrays.asList(ogr1,ogr2,ogr3,ogr4));
        System.out.println(notOrtKontrol(list));
        System.out.println(gunVarMi(list));
        System.out.println(noVarmi(list));


    }

    public static String notOrtKontrol(List<Can_Pojo> list){

       return list.
               stream().
               allMatch(t-> t.getOrtPuan()>98) ? "Hay Masallah" : "Olabilir";

    }
    public static String gunVarMi(List<Can_Pojo> list){
      return   list.
              stream().
              anyMatch(t-> t.getKursAdi().toLowerCase().contains("gun")) ? "en az bir tane var" : "Yok" ;

    }


    public static boolean noVarmi(List<Can_Pojo> list){
      return   list.stream().anyMatch(t-> t.getOgrNum()==154);

    }







}
