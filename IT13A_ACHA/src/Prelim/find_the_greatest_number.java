package Prelim;
import java.util.Scanner;
public class find_the_greatest_number {
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Input the first number");
    int  gk= scan.nextInt(); 
   
    System.out.println("Input the second number");
    int dodo = scan.nextInt();
    
    System.out.println("Input the third number");
    int undo = scan.nextInt(); 
       
    if(gk >dodo && gk>undo){System.out.println("the greatest number is : "+gk);
    
    }else if(dodo >gk && dodo>undo){System.out.println("the greatest number is : "+dodo);
    
    }else if(undo>dodo && undo>gk){ System.out.println("the greatest number is : "+undo);
    
    }else{System.out.println("kjasbdksadk");}
    
    }
}
