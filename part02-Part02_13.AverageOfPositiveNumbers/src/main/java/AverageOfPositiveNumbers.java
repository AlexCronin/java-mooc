
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numCount = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num > 0) {
                numCount = numCount + 1;
                sum = sum + num;
            } else if(num < 0){
                continue;
            } else {
                break;
            }
            
        }
        
        if(numCount == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (sum/numCount));
        }
        
    }
}
