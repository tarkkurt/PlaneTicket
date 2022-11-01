import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance , age , travelType;
        double paymentBeforeDiscount, ageDiscount, travelTypeDiscount, paymentWithDiscount;
            Scanner sc = new Scanner(System.in);
            System.out.print("Mesafeyi km türünden giriniz : ");
            distance = sc.nextInt();
            System.out.print("Yaşınızı giriniz : ");
            age = sc.nextInt();
            System.out.print("Yolculuk tipini giriniz (1 => Tek yön, 2 => Gidiş Dönüş ): ");
            travelType = sc.nextInt();
        if (distance <= 0 ) {
            throw new IllegalStateException("Hatalı veri girdiniz!");
        }else
            paymentBeforeDiscount = distance*0.10;
        if (age<= 0) {
            throw new IllegalStateException("Hatalı veri girdiniz!");
        } else if (age<12)  {
            ageDiscount = paymentBeforeDiscount*0.5;
        } else if (age<=24) {
            ageDiscount = paymentBeforeDiscount*0.1;
        } else if (age<=65) {
            ageDiscount = 0;
        } else {
            ageDiscount = paymentBeforeDiscount*0.3;
        }
        travelTypeDiscount = switch (travelType) {
            case 1 -> 0;
            case 2 -> (paymentBeforeDiscount - ageDiscount) * 0.3;
            default -> throw new IllegalStateException("Hatalı veri girdiniz!");
        };
        paymentWithDiscount = paymentBeforeDiscount-ageDiscount-travelTypeDiscount;
        System.out.println("Toplam tutar: " + paymentWithDiscount);
    }

}
