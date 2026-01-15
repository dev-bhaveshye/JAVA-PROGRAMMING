public class pract5 {
    public static void main(String[] args){
        // Find the sum of all elements in an array.

        int[] arr = {2, 4, 6, 2, 8, 2, 9 ,2};

        int sum =0 ;

        for (int a : arr){
            sum+=a;
        }
        System.out.println( sum);
    }
}
