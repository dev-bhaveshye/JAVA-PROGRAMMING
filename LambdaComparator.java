import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class LambdaComparator {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Bhavesh", 25),
            new Person("Amit", 22),
            new Person("Sonia", 30)
        );
        Collections.sort(people,(a,b)->b.name.compareTo(a.name));
        //Collections.sort(people,(a,b)->(b.age-a.age));
        // Sorting by age using Lambda
        //people.sort((p1, p2) -> Integer.compare(p1.age, p2.age));
        // Print sorted list
        System.out.println(people);
    }
}
