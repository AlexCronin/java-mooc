
import java.util.Scanner;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acale
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDict){
        this.scanner = scanner;
        this.dictionary = simpleDict;
    }
    
    public void start() {
        
        while(true) {
            System.out.println("Command:");
            String word = this.scanner.nextLine();

            if(word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(word.equals("add")) {
                System.out.println("Word: ");
                String input = this.scanner.nextLine();
                System.out.println("Translation: ");
                String input2 = this.scanner.nextLine();
                
                this.dictionary.add(input, input2);
            } else if(word.equals("search")) {
                System.out.println("To be translated: ");
                String input = this.scanner.nextLine();
                
                if(this.dictionary.translate(input) == null) {
                    System.out.println("Word " + input + " was not found");
                } else{
                    System.out.println("Translation: " + this.dictionary.translate(input) );
                }
                
            } else {
                System.out.println("Unknown Command");
            }
        }

    }
}
