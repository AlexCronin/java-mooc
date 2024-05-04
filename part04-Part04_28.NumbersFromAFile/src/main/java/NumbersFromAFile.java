
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> list = new ArrayList<>();
        int numberInRangeCount = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (fileScanner.hasNextLine()) {
                // we read one line
                String row = fileScanner.nextLine();
                // we add the line that we read
                if(Integer.valueOf(row) >= lowerBound && Integer.valueOf(row) <= upperBound) {
                    numberInRangeCount++;
                    System.out.println(Integer.valueOf(row));
                }
        
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Numbers: " + numberInRangeCount);
    }

}
