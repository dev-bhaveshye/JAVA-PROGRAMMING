interface Se {
    String engineer();
    
}
public class LambdaExression {
    public static void main(String[] args) {
        Se se=()-> "software engineer";
        System.out.println(se.engineer());
    }
}
