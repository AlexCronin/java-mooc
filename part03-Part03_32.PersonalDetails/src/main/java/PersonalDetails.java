
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameLength = 0;
        String longestName = "";
        int sumOfBirthYears = 0;
        int personCount = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            if(parts[0].length() > nameLength) {
                nameLength = parts[0].length();
                longestName = parts[0];
            }
            
            sumOfBirthYears = sumOfBirthYears + Integer.valueOf(parts[1]);
            
            personCount++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sumOfBirthYears / personCount);
        
    }
}
