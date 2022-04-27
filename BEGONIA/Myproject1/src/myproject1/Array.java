package myproject1;

public class Array {
    
    public static void main(String[] args) {
        System.out.print("Even number:");
        int [] num = {1, 2, 3, 8, 9, 78, 77, 99, 25, 23, 41};
        for (int i = 0;i < num.length; i++){
             if (num[i] % 2 == 0){
               
                System.out.print(num[i] +" ");
            }
        }   
        System.out.println("");
        System.out.print("Odd numbers:");
       for (int i = 0;i < num.length; i++){
             if (num[i] % 2 != 0){
               
                System.out.print(num[i] +" ");
            }
        } 
    }
}
