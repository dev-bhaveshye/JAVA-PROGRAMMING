public class pract3 {

    public static boolean check (int[] arr){

        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i-1]>arr[i]){
                return false ; 
            }
        }
        return true;

    }
    public static void main(String[] args){
        //Check if an array is sorted or not.

        int[] arr = {1,2,3,4,5,6,34,65,69,80};

        System.out.println(check(arr));
    }
}
