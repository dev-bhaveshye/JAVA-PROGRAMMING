public class pract2 {
    public static void main(String[] args){
        //Find the largest and smallest element in an array.

        int[] arr = {1,2,3,4,5,6,34,65,1,-5,-7};


        int max = 0 ;
        int min = 0 ; 
        int i = 0;

        while(i < arr.length){

            min = Math.min(arr[i] , min);
            
            max = Math.max(arr[i],max);

            i++;
        }

        System.out.println(max + "   "+ min);


    }
}
