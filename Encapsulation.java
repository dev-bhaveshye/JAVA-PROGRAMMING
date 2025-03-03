package main;


public class Encapsulation {
     void do_work() {  // ✅ Correct method definition
        System.out.println("working");
    }
    

    
static class laptop{
    private int Price;
    public void setPrice(int Price){
        boolean isAdmin= true;
        if(!isAdmin){
            System.out.println("you can not set the price");
        }else{
            this.Price=Price;

        }
        
    }
    public int getPrice() {
        return Price;
    }
}

public static void main(String[] args) {
    Encapsulation obj = new Encapsulation();
    obj.do_work();  // ✅ Correct method call
    
    laptop lp= new laptop();
    lp.setPrice(24);

   System.out.println( lp.getPrice());
}
}

//default void only access in same file 
//public can be accessed from both same and different file 
//private can be accessed in same class but not in same other class in same file 
