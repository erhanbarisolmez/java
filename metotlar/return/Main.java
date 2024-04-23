public class Main {
    public static int ikiilecarp(int a){
        return a*2;
    }

    public static int ikiiletopla(int a){
        return a + 2;
    }
    public static int dortilecarp(int a){
        return a * 4;
    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }

    public static int deneme (int a){
        System.out.println("çıktı veriliyor");
        return a * 2;
    }
    public static void main(String[] args){
        System.out.println("Çıktı değerleri: " +  toplama(1, 2, 3));
        System.out.println("Sonuç : " + dortilecarp(ikiiletopla(ikiilecarp(8))));
        System.out.println(deneme(4));
    }
}
