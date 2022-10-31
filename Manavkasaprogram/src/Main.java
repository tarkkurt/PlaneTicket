import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int buya, buye, buyd, buym, buyp;
        double Total, Armutkg = 2.14, Elmakg = 3.67, Domateskg = 1.11, Muzkg = 0.95, Patlicankg= 5.00;

        Scanner sc = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        buya = sc.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        buye = sc.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        buyd = sc.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        buym = sc.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        buyp = sc.nextInt();

        Total = ((Armutkg*buya) + (Elmakg*buye) + (Domateskg*buyd) + (Muzkg*buym) + (Patlicankg*buyp));
        System.out.println("Toplam Ödenecek Tutar : " + Total + " TL ");
    }
}
