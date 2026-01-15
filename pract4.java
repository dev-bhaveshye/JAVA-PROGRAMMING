public class pract4 {
    public static void main(String[] args){

        // Count Occurrences of a Number in an Array 

        int[] arr = {2, 4, 6, 2, 8, 2, 9 ,2};
        int x = 2;


        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++;
            }
        }

        System.out.println(count);


    }
}
