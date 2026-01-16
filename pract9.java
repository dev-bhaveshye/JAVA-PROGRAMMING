package Exercise;
import java.util.*;

public class pract9 {
    public static void main(String[] args){
        // Frequency of elements
        // Given an array, print frequency of each number.
        // Example: [1,2,2,3] → 1→1, 2→2, 3→1


        int[] arr = {2, 4, 6, 2, 8, 2, 9 ,2};

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int a : arr){
            if(!map.containsKey(a)){
                map.put(a,1);
            }else{
                map.put(a,map.get(a)+1);
            }

        }

        System.out.println(map);
    }
}
