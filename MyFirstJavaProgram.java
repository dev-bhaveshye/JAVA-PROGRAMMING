import java.util.*;
public class MyFirstJavaProgram {

    /* This is my first java program.
     * This will print 'Hello World' as the output
     */
    public static void main(String []args) {
       System.out.println("*\n**\n***\n****\n*****");

       int a= 25; 
       int b= 35;
       int sum = a+b;
       System.out.println(sum);
       int mul = a*b;
       System.out.println(mul);

       Scanner sc = new Scanner(System.in);
   
       int c= sc.nextInt();
       int d= sc.nextInt();
       sum= c+d;
       System.out.println(sum);

    }
}