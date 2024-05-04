
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (fileScanner.hasNextLine()) {
                // we read one line
                String row = fileScanner.nextLine();
                // we add the line that we read
                list.add(row);
        
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("");

        System.out.println("Search for:");
        
        String name = scanner.nextLine();

        if (list.contains(name)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found");
        }
        

    }
}
