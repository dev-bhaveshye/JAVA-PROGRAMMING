class Custom<T extends Number>{
    T data;
    public Custom(T Data){
        this.data=Data;
    }
    public void print(){
        System.out.println(data);
    }

    

}
public class Generic_method {
    public static void main(String[] args){
        print("Bhavesh");
        print(123);

        Custom<Integer> obj = new Custom<>(11);
        obj.print();

        
    }

    public static <E> void print(E data){  // Generic_method 
        System.out.println(data);
    }

    
    
    

    
}








