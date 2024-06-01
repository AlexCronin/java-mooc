
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acale
 */
public class UserInterface {
    
    private TodoList task;
    private Scanner scanner;
    
    public UserInterface(TodoList task, Scanner scanner) {
        this.task = task;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            } else if(input.equals("add")) {
                System.out.println("To add: ");
                String input2 = this.scanner.nextLine();
                this.task.add(input2);
            } else if(input.equals("list")) {
                this.task.print();
            } else if(input.equals("remove")) {
                System.out.println("Which one is removed?");
                int idToRemove = Integer.parseInt(this.scanner.nextLine());
                this.task.remove(idToRemove);
            }
        }
    }
}
