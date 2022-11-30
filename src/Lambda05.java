import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
        System.out.println(topla(5));
        System.out.println(toplaCincix(5));
        System.out.println(ciftTopla(4));
        System.out.println(pozCiftSayTopla(4));
        System.out.println(pozTekSayTopla(4));
        ikininilkXKuvvet(3);
        System.out.println();
        istenenSayiilkXKuvveti(3,2);
        System.out.println();
        System.out.println(faktoriyel(5));

    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar
    // (x dahil) tamsayilari toplayan bir program create ediniz.

    //Structured
    public static int topla(int x){
        int toplam=0;
        for (int i=0;i<=x;i++){
            toplam+=i;
        }
        return toplam;
    }
     //Functional
    public static int toplaCincix(int x){//

     return    IntStream.//int degerlerde bir akış saglar
             range(1,x+1).//range(a,b) a dan b ye kadar(b dahil degil) int degerler akısa alındı
             sum();//akıstan gelen degerler toplandı
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int ciftTopla(int x){
      return   IntStream.
              rangeClosed(1,x).
              filter(Lambda01::ciftBul).sum();
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.

    public static int pozCiftSayTopla(int x){

      return IntStream.
              iterate(2, t-> t+2).//2 den sonsuza kadar elemaları2 artırarak akısa alır-->2,4,6,8,10....
              limit(x).//x ile sınırlıyoruz
              sum();//akıstan gelen degerleri topluyoruz

    }
    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.

    public static int pozTekSayTopla(int x){

        return IntStream.
                iterate(1, t-> t+2).//1 den sonsuza kadar elemaları 2 artırarak akısa alır-->1,3,5,7,9...
                        limit(x).//x ile sınırlıyoruz
                        sum();//akıstan gelen degerleri topluyoruz

    }
    //TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void ikininilkXKuvvet(int x){
       IntStream.
                iterate(2, t->t*2).//iterasyon icin sart yazdık
                limit(x).//x degeri ile sınırladık
               forEach(Lambda01::yazdir);//Lambda01 clasındaki yazma methodunu cagırıp yazdırdık
    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void  istenenSayiilkXKuvveti(int istenensayi, int x){
        IntStream.
                iterate(istenensayi,t->t*istenensayi).
                limit(x).
                forEach(Lambda01::yazdir);

    }

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int  faktoriyel(int x){
      return   IntStream.
                rangeClosed(1,x).
                reduce(1,(t,u)-> t*u);



    }






}
