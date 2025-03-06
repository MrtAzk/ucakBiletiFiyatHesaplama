import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double distance;
        int age;
        int travelType;

        // Geçerli mesafe girişi alana kadar tekrar sor
        while (true) {
            System.out.print("Mesafeyi km türünden giriniz: ");
            distance = scanner.nextDouble();
            if (distance > 0) {
                break;
            }
            System.out.println("Hatalı giriş! Mesafe 0'dan büyük olmalıdır.");
        }

        // Geçerli yaş girişi alana kadar tekrar sor
        while (true) {
            System.out.print("Yaşınızı giriniz: ");
            age = scanner.nextInt();
            if (age > 0) {
                break;
            }
            System.out.println("Hatalı giriş! Yaş 0'dan büyük olmalıdır.");
        }

        // Geçerli yolculuk tipi alana kadar tekrar sor
        while (true) {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
            travelType = scanner.nextInt();
            if (travelType == 1 || travelType == 2) {
                break;
            }
            System.out.println("Hatalı giriş! Yolculuk tipi sadece 1 veya 2 olabilir.");
        }


        double unitPrice = 0.10;
        double price = unitPrice*distance;
        double discountRatio= 0;

        //Error Checking for invalid input

           if (age<12){
               discountRatio = 0.50;
           } else if (age >= 12 && age <= 24) {
               discountRatio = 0.10;
           } else if (age>65) {
               discountRatio = 0.20;
               
           }
           double discountForAge = price * discountRatio;
           double discountPrice = price - discountForAge;
            //Apply Round-Trip Discount
            if (travelType==2){
                discountPrice = 2*(discountPrice*0.80);
            }
            System.out.println("Toplam tutar = " + discountPrice + " TL");
        scanner.close();

        }


}
