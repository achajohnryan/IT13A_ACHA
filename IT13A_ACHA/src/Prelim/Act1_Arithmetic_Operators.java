
package Prelim;


public class Act1_Arithmetic_Operators {
     public static void main(String[] org){
             
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3; 
        
        
        
        int low1 = numb1 * numb3 + numb2;
        int depend1 = numb1 - numb3;
        int low2 = depend1 % numb2;
        int depend2 = numb1 + numb3 + numb2;
        int low3 = depend2 / numb4;
        int depend3 = numb3 * numb3;
        int low4 = numb1 * numb2 - depend3;
        
          System.out.println("10 * 4 + 6 ="+low1);
         System.out.println("(10-4) % 6 = "+low2);
            System.out.println("(10 + 4 + 6)/3 = "+low3);
               System.out.println("10 * 6 -(4 * 4 ) = "+low4);
               
     }
}
