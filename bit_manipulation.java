import java.util.*;
public class bit_manipulation {
    public static void main(String []args) {
        // get bit
        int n = 5 ;
        int pos = 3;
        int bitmask=1<<pos;

        if ((bitmask & n)==0 ){
            System.out.println("bit was 0");
        }
        else{
            System.out.println("bit is 1");
        }

        // set bit 

        int n2=5;
        int pos2 =1;
        int bitmask2=1<<pos2;

        int newnumber = bitmask2 | n2;
        System.out.println(newnumber);

        //clear bit

        int n3=5;
        int pos3 =2;
        int bitmask3=1<<pos3;
        int notBitmask = ~(bitmask3);

        int newnumber3 = notBitmask & n3;
        System.out.println(newnumber3);

        //update bit

        int n4=8;
        int pos4 =3;
        int bitmask4=1<<pos4;
        Scanner sc = new Scanner(System.in);
        int oper=sc.nextInt();

        if (oper==1){
            //set operation
            int newnumber4 = bitmask4 | n4;
            System.out.println("new string is "+newnumber4);

        }else{
            // clear bit operation
            int notBitmask4 = ~(bitmask4);
            int newnumber4 = notBitmask4 & n4;
            System.out.println("new string is "+newnumber4);


        }

        
        

    }

}