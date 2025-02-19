import java.util.*;
public class two_D_array {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colu=sc.nextInt();
        int[][] number= new int[row][colu];


    for (int i=0;i<row;i++){
        for(int j=0;j<colu;j++){
            number[i][j]=sc.nextInt();
        }
    }

         for(int i =0;i<row;i++){
            for(int j=0;j<colu;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
         }

         int x = sc.nextInt();
         for(int i =0;i<row;i++){
            for(int j=0;j<colu;j++){
                if (number[i][j]==x){
                    System.out.println("found at index ("+ i +"," +j + ")");

                }

            }
                
        }
 
    }
    
}
