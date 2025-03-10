package DSA;
import java.util.*;

public class Selection_Sort {
    public static void main(String[] args){
        int[] arr={9,8,7,1,2,4};
        

        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                
            }int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            System.out.println(arr[i]);
                
            
        }
        
    }
    
}
    

