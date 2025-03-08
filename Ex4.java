package Exercise;
// pattern 
public class Ex4 {
    public static void main(String[] args){
        for (int i=0;i<=4;i++){
            int space = 5-i;
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }for(int k=0;k<=i*2;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}
