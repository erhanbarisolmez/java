package metotlar.miniproje.ebob;
import java.util.Scanner;

public class Main{
    public static int findEbob(int s1, int s2){
        int ebob = 1;

        for (int i = 1; i <= s1 && i<= s2; i++) {
            if((s1 % i == 0) && (s2 % i == 0)){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayı: ");
        int s1 = scanner.nextInt();
        System.out.println("İkinci Sayı: ");
        int s2 = scanner.nextInt();

        System.out.println("iki sayının ebobu: " + findEbob(s1, s2));


    }
}