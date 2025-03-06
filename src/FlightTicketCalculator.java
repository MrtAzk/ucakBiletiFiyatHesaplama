import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //Distance input
        System.out.println("Mesafeyi km türünden giriniz: ");
        double distance = scanner.nextDouble();

        // Age input
        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        //Type of travel input
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int travelType = scanner.nextInt();


        double unitPrice = 0.10;
        double price = unitPrice*distance;
        double discountRatio= 0;

        //Error Checking for invalid input

        if (age<0 || distance<0 || (travelType!=1 && travelType!=2)){

            System.out.println("Hatalı Veri Girdiniz! ");
            //Checking discount for age
        } else{
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

        }

        scanner.close();
    }
}
