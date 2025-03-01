import java.util.*;
public class string_stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(0 ,'s');
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);

        sb.append("y");
        System.out.println(sb);

        System.out.println(sb.length());

       

        for(int i=sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
            
        }
        System.out.println("\n");

        // reversing using string builder

        for (int i =0 ; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontchar= sb.charAt(front);
            char backchar= sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back,frontchar);


        }
        System.out.println(sb);


        






    }

    
}
