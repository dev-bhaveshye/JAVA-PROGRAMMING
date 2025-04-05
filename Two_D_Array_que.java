import java.util.*;
public class Two_D_Array_que {
    public static void main(String[] args){
        
        int [][]a= {{10,20,30},
                    {50,60,70},
                    {90,100,110}
        };
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        




    }
}
