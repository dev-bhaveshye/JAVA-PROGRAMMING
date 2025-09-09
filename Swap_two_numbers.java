
import java.util.*;
public class Swap_two_numbers {



    public void  change(int num1 , int num2){

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+ " this is num1");
        System.out.println(num2+ " this is num2");
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();




        Swap_two_numbers swap = new Swap_two_numbers();

        swap.change(a,b);
        
    }
}
