
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num!=0) {
                numberOfNumbers = numberOfNumbers + 1; 
                continue;
            } else {
                System.out.println("Number of numbers: " + numberOfNumbers);
                break;
            }
        }
    }
}
