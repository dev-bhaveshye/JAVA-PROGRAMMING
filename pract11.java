package Exercise;
import java.util.*;

public class pract11 {
    public static char nonrepeating(String s ){

        HashMap<Character , Integer> map = new HashMap<>();

        char result = 'z';
        for(int i = 1; i< s.length(); i++){
            
            char first = s.charAt(i-1);
            char second = s.charAt(i);

            if(!map.containsKey(first)){
                map.put(first,1);
            }else{
                map.put(first , map.get(first)+1);
            }

            if(first != second && map.get(first) ==1){
                return first ; 
            }
            if(first != second && i == s.length()-1){
                return second;
            }

        }
        return 'z';
    }
    public static void main(String[] args){

        // Find the first non-repeating character  
        // Input: "aabbcdde" → Output: c

        String s = "aaccdde"; 
        System.out.println(nonrepeating( s ));


    }
}
