import java.util.*;
public class MySecondJavaProgram {
    public static void main(String []args) {
        // System.out.println("*\n**\n***\n****");
        // int a=27;
        // int b=87;
        // int sum=a+b;
        // System.out.println(sum);
        // int mul=a*b;
        // System.out.println(mul);
        Scanner sc= new Scanner(System.in);
        // int d= sc.nextInt();
        // int c= sc.nextInt();
        // int summ=d+c;
        // System.out.println(summ);
        // int mull=d*c;
        // System.out.println(mull);

        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("hello");
            break;
        
            case 2 : System.out.println("ram ram");
            break;
        
            case 3 : System.out.println("jai shree ram");
            break;
        
            case 4 : System.out.println("namaste");
            break;

            default : System.out.println("invalid");
            break;
        }
        
        


    }
}

