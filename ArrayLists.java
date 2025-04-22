import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new ArrayList<String>();

        //add element
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        // get element
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set / change element
        list.set(0,5);
        System.out.println(list);

        //remove element
        list.remove(0);
        System.out.println(list);

        //size of array 
        int size = list.size();
        System.out.println(size);

        //looop 
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        //sorting 
        Collections.sort(list);
        System.out.println(list);

    }
    
    
}
