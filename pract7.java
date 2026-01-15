public class pract7 {
    public static void main(String[] args){
        //Check whether a string is a palindrome.

        String s = "lol";

        int start = 0 ; 
        int end = s.length()-1;
        boolean result = true ; 

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                result = false ;
            }
            start++;
            end--;

        }
        System.out.println(result);
    }
}
