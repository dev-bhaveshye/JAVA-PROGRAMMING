import java.util.*;
public class ifelse {
    public static void main(String []args) {
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.nextLine();
        
        if (a == b) {
            System.out.println("equal");
        }
        else{ if (a > b)  {
            System.out.println("a greater than b ");
        }
        else{
            System.out.println("a lesser than b");
        }
            
        }


    }
    
}
