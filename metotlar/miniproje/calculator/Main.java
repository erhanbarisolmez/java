import java.util.Scanner;

public class Main{
    public static int minus(int a, int b){
        return (a-b);
    }
    public static double dividedBy(int a, int b){
        return ((double)a/b);
    }

    public static int plus(int a, int b){
        return (a + b);
    }
    public static int plus(int a, int b, int c){
        return (a+b+c);
    }

    public static double multiply(int a, int b){
        return a*b;
    }

    public static double multiply(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Toplama işlemi\n"
                         + "2. Çıkarma işlemi\n "
                         + "3. Çarpma işlemi \n"
                         + "4. Bölme işlemi \n"
                         + "Çıkış için q' ya basın.";
       System.out.println("**************");
       System.out.println(islemler);
       System.out.println("**************");

       while (true){
        System.out.println("İşlemi seçin: ");
        String islem = scanner.nextLine();

        if(islem.equals("q")){
            System.out.println("Programdan Çıkılıyor");
            break;
        }
        else if (islem.equals("1")){
            System.out.println("Kaç değer toplayacaksınız ?(2 veya 3): ");

            int kacSayi = scanner.nextInt();

            if(kacSayi == 2){
                System.out.println("a: ");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların toplamları: " + plus(a, b));
            }
            else if(kacSayi == 3){
                System.out.println("a: ");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b= scanner.nextInt();
                System.out.println("c:");
                int c= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların toplamları: " + plus(a, b, c));
            }
            else {
                System.out.println("Bunun için metod bulunmuyor...");
            }
        }

        else if (islem.equals("2")){
            System.out.println("a: ");
            int a = scanner.nextInt();
            System.out.println("b:");
            int b= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Girilen sayıların farkları: " + minus(a, b));
        }
        else if (islem.equals("3")){
            System.out.println("Kaç değer çarpacaksınız ?(2 veya 3): ");

            int kacSayi = scanner.nextInt();

            if(kacSayi == 2){
                System.out.println("a: ");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların çarpımı: " + multiply(a, b));
            }
            else if(kacSayi == 3){
                System.out.println("a: ");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b= scanner.nextInt();
                System.out.println("c:");
                int c= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların çarpımı: " + multiply(a, b, c));
            }
            else {
                System.out.println("Bunun için metod bulunmuyor...");
            }
        }

        else if (islem.equals("4")){
            System.out.println("a: ");
            int a = scanner.nextInt();
            System.out.println("b:");
            int b= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Girilen sayıların bölümü: " + dividedBy(a, b));
        }
        else{
            System.out.println("Geçersiz işlem...");
        }
       }
    }
}