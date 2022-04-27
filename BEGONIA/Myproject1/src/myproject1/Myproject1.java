/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject1;

import java.util.Scanner;

public class Myproject1 {

    String l;
    String vowel;
  
    public static void main(String[] args) {
        Scanner letter = new Scanner (System.in);
        System.out.println("Enter a character: ");
        String l = letter.nextLine();
        
        switch (l) {
            
            case "a":
                System.out.println("You enter a vowel");
                break;
                
            case "e":
                System.out.println("You enter a vowel");
                break; 
                
            case "i":
                System.out.println("You enter a vowel");
                break;   
            
            case "o":
                System.out.println("You enter a vowel");
                break;   
           
            case "u":
                System.out.println("You enter a vowel");
                break;   
            
                
            default:
                System.out.println("You enter a consonant");
        
        
        
        }
       
 
    }  
        
    
}
