public class LambdaThread {
    public static void main(String[] args) {
        Runnable runnable =()->{
            for(int i=0 ; i<=10;i++){
                System.out.println("hello"+i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.run();
    }
}
