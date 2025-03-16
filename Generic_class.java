class College<E,T>{
    E id;
    T name;

    public College(E Id , T Name){ // Generic class 
        this.id=Id;
        this.name=Name;
    }
    public E getId() { 
        return id;
    }
    public T getName(){  
        return name;
    }
}
public class Generic_class {
    
    public static void main (String[] args){

        College<Integer , String> college= new College<>(22,"Bhavesh");

        System.out.println(college.getName());
        System.out.println(college.getId());
    }
    
}
