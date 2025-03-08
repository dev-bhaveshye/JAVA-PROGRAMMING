package Exercise;
import java.util.*;
public class Ex2 {
    //Write a Java program that takes three numbers from the user and prints the greatest number.
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();  // Closing Scanner to prevent resource leaks

        if (a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println(" b is greater");
        }else if(c>a && c>b){
            System.out.println("c is greater");
        }else if(a==b && a>c){
            System.out.println("a and b are greater than c"); 
        }else if((a==c && a>b)){
            System.out.println("a and c are greater than b");
        }else if(b==c && b>a){
            System.out.println("b and c are greater than a");
        }else{
            System.out.println("all no. are equal");
        }

    }

}
            
        

    

