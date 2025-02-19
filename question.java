//  import java.util.*;
//  public class question {
//     QUESTION NO 1 ( AVERAGE OF 3 NUMBERS )
//     public static void printAverage(int a,int b , int c){
//         int average = (a+b+c)/3;

//         System.out.println(average);
//         return;
//     }
//     public static void main(String []args){
//         Scanner sc  =new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         printAverage(a,b,c);

// }

// }

import java.util.*;
public class question {
    public static void sumOdd(int n){
        int sum =0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                System.out.print("");
            }else{
                sum = sum +i; 
            }

        }
        System.out.println(sum);
    }
        public static void main(String []args){
            Scanner sc  =new Scanner(System.in);
            int n = sc.nextInt();
            sumOdd(n);


        }

        
    

}