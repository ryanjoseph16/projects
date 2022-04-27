
package sampleactivities;

import java.util.Scanner;

public class SampleActivities {
    
    public static void main(String[] args) {
       String input;
       String consonant = "";
       Scanner letter = new Scanner(System.in);
       System.out.print("Enter letter: ");
       input = letter.next();
       String vowel ="" ;
        switch(input){
           
           case "a", "A", "e", "E", "i", "I", "o", "O", "u", "U" -> vowel = "You entered a vowel ";
           default -> consonant = "You entered a consonant";         
       }
        System.out.println( vowel);
        System.out.println( consonant);  
    }   
}