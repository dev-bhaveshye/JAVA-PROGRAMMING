import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int number[]= new int [size];

        for (int i=0;i<size;i++){
            System.out.print("enter array element: "+ i);
            number[i]=sc.nextInt();
        }
        System.out.println("enter number to search ");
        int search =sc.nextInt();


        for (int i =0;i<number.length;i++){
            if (number[i]==search){
                System.out.print("searched number is at index "+ i);
            }
        }

        

    }
}
