import java.util.*;
public class Optional_Null {
    public static void main(String[] args){
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Bhavesh", null);
        marks.put("Yash", 54);
        marks.put("Mama", 84);

        System.out.println(marks);

        //System.out.println(marks.get("Bhavesh")<10);

        Optional <Integer> nullmarks = Optional.ofNullable (marks.get("Bhavesh"));
        System.out.println(nullmarks);
        if(nullmarks.isPresent()){
            System.out.println("value is present");
        }else{
            System.out.println("value is not present");
        }
        
        // another method
        
        // List of student names
        List<String> students = List.of("Bhavesh", "Yash", "Mama", "Rohan");

        // Checking marks dynamically for all students
        students.forEach(name -> 
            Optional.ofNullable(marks.get(name))
                .ifPresentOrElse(
                    value -> System.out.println(name + "'s marks: " + value),
                    () -> System.out.println("No marks available for " + name)
                )
        );
            
        



    }
    
}
