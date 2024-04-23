public class Main{

    public static void skorHesapla(String isim, int puan){
        System.out.println(isim + ",isim adlı oyuncunun skoru: " + puan);
    }
    public static void skorHesapla(int puan){
        System.out.println("isimsiz oyuncunun skoru" + puan);
    }

    public static void skorHesapla(String isim){
        System.out.println( isim + " isim adlı oyuncunun puanı yok");
    }
    public static void toplama(String a, String b){
        System.out.println(a + " " + b);
    }
    public static void toplama(int a, int b){
        System.out.println("toplamları : " + (a+b));
    }

    public static void toplama(int a, int b, int c){
        System.out.println("Toplamları = " + (a+b+c));
    }
    public static void main(String[] args){
        toplama(3, 4, 5);
        toplama(2, 5);
        toplama("Erhan", "Barış");
        skorHesapla("Murat ", 1000);
        skorHesapla("Mehmet ");
        skorHesapla(1500);
    }
}