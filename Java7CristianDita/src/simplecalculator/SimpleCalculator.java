/*
Simple computer
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Alis
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. Display in console "Please introduce your first number:"
        2. Read first number from console
        3. Please introduce operator
        4. Read operator
        5. Please introduce second number
        6. Read second number from console
        7. Please introduce "="
        8. Read from console
        9. Result is: 
        10. Display final result 
        */
        System.out.println("Please introduce your first number:");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int firstnumber = Integer.parseInt(input);
        System.out.println("Please introduce operator(+/-/*//)");
        Scanner keyboard1 = new Scanner(System.in);
        input = keyboard1.nextLine();
        char operation = input.charAt(0);
        System.out.println("Please introduce your second number");
        Scanner keyboard2 = new Scanner(System.in);
        input = keyboard2.nextLine();
        int secondnumber = Integer.parseInt(input);
        int result = 0;
        switch(operation){
            case'+': result = firstnumber + secondnumber;
                break;
            case'-': result = firstnumber - secondnumber;
                break;
            case'*': result = firstnumber * secondnumber;
                break;
            case'/': result = firstnumber / secondnumber;
                break;
            default: System.out.println("Sorry, you introduced wrong data. I quit :)"); 
                break;
        }        
        System.out.println("Result is: "+result);
        
      
        
        
        
       
                
    }
    
}
