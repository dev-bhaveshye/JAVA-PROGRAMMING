public class pract6 {
    public static void main(String[] args){
        // Reverse a string.

        String s = "abcdef";
        //String rev = "";
        StringBuilder builder = new StringBuilder();


        for(int i = s.length()-1 ; i >=0 ; i--){
            builder.append(s.charAt(i));
        }

        System.out.println(builder);
    }
}
