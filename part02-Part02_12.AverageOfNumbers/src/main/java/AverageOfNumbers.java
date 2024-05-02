
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numCount = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num != 0) {
                numCount = numCount + 1;
                sum = sum + num;
            } else {
                break;
            }
            
        }
        
        System.out.println("Average of the numbers: " + (sum/numCount));
        
    }
}
