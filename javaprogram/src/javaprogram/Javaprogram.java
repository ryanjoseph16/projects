
package javaprogram;

import java.util.Scanner;
 
public class Javaprogram {

   
    public static void main(String[] args) {
        
        Scanner numbers = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Enter first number: ");
        num1 = numbers.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = numbers.nextInt();
        
        System.out.print("Enter third number: ");
        num3 = numbers.nextInt();
        
        if (num1 > num2){
            System.out.println(num1+ " is the largest number");
                
        }else if (num2 > num3){
            System.out.println(num2 + " is the largest number");
        
        }else if (num3 > num1){
            System.out.println(num3 + " is the largest number");
        
        }else {
            System.out.println("Equal numbers");
        }
        
        
    }
    
}
