
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        int indexAt = 0;
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 9999) {
                break;
            }
            
            if(num < smallest) {
                smallest = num;
                indexAt = index;
            }
            
            list.add(num);
            index++;
            
        }
        
        System.out.println("Smallest number: " + smallest );
        System.out.println("Found at index: " + indexAt);

        
    }
}
