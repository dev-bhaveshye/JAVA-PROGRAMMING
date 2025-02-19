import java.util.*;
public class function {
    // public static void myName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static int multiply(int a,int b){
    //     return a*b;
        
        public static  void factorial(int n){
            int constant =1;
            for(int i=n ; i>=1;i--){
                constant = constant *i;
            }
            System.out.println(constant);
            return;
            
        }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

       
        
        // int a  = sc.nextInt();
        // int b  = sc.nextInt();
         int n  = sc.nextInt();
        
    

        factorial(n);

        



    }
    
}
