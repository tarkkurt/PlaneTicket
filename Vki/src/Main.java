import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height , weight , vki ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        height = sc.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        weight = sc.nextDouble();
        vki = weight / (height * height);
        System.out.println("Vücut kitle endeksiniz: " + vki);

    }
}