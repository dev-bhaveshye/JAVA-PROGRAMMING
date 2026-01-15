public class pract8 {
    public static void main(String[] args){

        //Find the length of a string without using length().

        String s = "abcdefgh";
        int length = 0;
        int i = 0 ; 
        try{
            while(true){
                if(s.charAt(i)!=',')
                length++;
                i++;
            }
        }catch(Exception e){
            System.out.println(length);
        }
    }
}
