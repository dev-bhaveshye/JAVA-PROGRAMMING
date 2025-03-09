import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        // country / population
        HashMap< String,Integer> map=new HashMap<>();

        // insertion
        map.put("India",120);
        map.put("China",150);
        map.put("Us",30);
        map.put("Nepal",12);

        System.out.println(map);

        map.put("China",80);//update china to 80
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present");
        }
        if(map.containsKey("Indonesia")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // remove
        map.remove("China");
        System.out.println(map);

        //Iteration
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e.getKey()+" = ");
            System.out.println(e.getValue());
        }
        // iteration for keys
        Set<String> keys =map.keySet();
        for(String key:keys){
            System.out.println(key+ " "+map.get(key));
        }
        


    }
    
}
