import java.util.*;
public class Hashing {
    public static void main(String[] args){
        //Creating
        HashSet<Integer> set=new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //Search / Contains
        if(set.contains(1)){
            System.out.println("set contains 1");

        }
        if(!set.contains(6)){
            System.out.println("set does not contains 6");
        }

        //remove / delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contains 1");
        }

        //size
        System.out.println(set.size());

        //print all elements 
        System.out.println(set);

        // Iterator 
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }   


    
}
