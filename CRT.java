import java.util.*;

public class CRT {
     public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        // String b= sc.nextLine();
        // System.out.println(a.length());
        // System.out.println(a.concat(b));
        // System.out.println(a+b);
        // System.out.println(a.equals(b));
        //char search= sc.nextLine().charAt(0);
        String z =" ";
        String y ;
        // for (int i = 0; i<(a.length());i++){
        //     z=System.out.println(a.charAt(i));
             
           
        
            

        
        for (int i =(a.length()-1);i>=0;i-- ){
           z=z+(a.charAt(i));
        }
        if (z==a){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }

}    

