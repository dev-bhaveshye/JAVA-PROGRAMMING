
package Exercise;
import java.util.*;

public class pract10 {
    public static void main(String[] args){
        // Frequency of characters in a string
        // Input: "aabcc" → a→2, b→1, c→2

        String s = "aabccc";

        HashMap <Character , Integer> map = new HashMap <>();

        for(int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c , map.get(c)+1);
            }
        }

        System.out.println(map);
    }
}
