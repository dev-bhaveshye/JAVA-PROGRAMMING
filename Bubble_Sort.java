package DSA;
import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args){
        int[] arr= {1,45,23,62,7,8,3};
        System.out.println(arr.length);

        for (int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }

            }
        }
        for (int i=0; i<=arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
