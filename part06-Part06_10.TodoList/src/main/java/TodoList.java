
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acale
 */
public class TodoList {
    
    private ArrayList<String> todoList;
    
    public TodoList() {
         this.todoList = new ArrayList();
    }
    
    public void add(String task) { //- add the task passed as a parameter to the todo list.
        todoList.add(task);
    }
    public void print() {   // - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
        for(int i = 0; i < todoList.size(); i++) {
            System.out.println(i+1 + ": " + todoList.get(i));
        }
    }
    public void remove(int number) {    // - removes the task associated with the given number; the number is the one seen associated with the task in the print.
        todoList.remove(number-1);
    }
}
