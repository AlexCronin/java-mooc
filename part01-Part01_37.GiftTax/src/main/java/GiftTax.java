
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax;
        double exceeding;
        
        if(value < 5000){
            System.out.println("No tax!");
        } else if(value <= 25000 ){
            exceeding = value - 5000;
            tax = 100 + (exceeding*.08);
            System.out.println("Tax: " + tax);
        } else if(value <= 55000 ){
            exceeding = value - 25000;
            tax = 1700 + (exceeding * 0.1);
            System.out.println("Tax: " + tax);
        } else if(value <= 200000 ){
            exceeding = value - 55000;
            tax = 4700 + (exceeding * 0.12);
            System.out.println("Tax: " + tax);
        } else if(value <= 1000000 ){
            exceeding = value - 200000;
            tax = 22100 + (exceeding * 0.15);
            System.out.println("Tax: " + tax);
        } else{
            exceeding = value - 1000000;
            tax = 142100 + (exceeding * 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}
