

public class Class_Object {
    public static void main(String []args) {
//         Person p1 = new Person();
//         p1.name="bhavesh";
//         p1.age=20;

   
//         Person p2 = new Person();
//         p2.name="bhavesh";
//         p2.age=20;    
        
//         Person p3 = new Person(23,"yashhhhh");
//         System.out.print(p3.age+p3.name);
        

//         System.out.println(p1.name +" "+p2.age);
//         p2.walk();
//         p2.walk(45);
//         p1.eat();
//         p3.walk();

//         System.out.println(Person.Count);

//         Developer d1= new Developer(26,"eshika");
//         d1.walk();
//         d1.eat();



     }
}

// class Developer extends Person{
//     public Developer(int age , String name ){
//         super(age, name);


 class Persons {  
    public String name;
    public int age;

    // static int Count;
    // public Person(){
    //     Count++;
    //     System.out.println("creating an object");
    // }
     public Persons(int i_age , String i_name ){
         
         name=i_name ;
         age=i_age;
     }

    void walk(){
        System.out.println(name+" "+"is walking");
    }
    void eat(){
        System.out.println(name+" "+ "is eating");
    }
    void walk(int steps ){
        System.out.println(name +" "+"walked "+" "+ steps+" "+"steps");
    }
}
