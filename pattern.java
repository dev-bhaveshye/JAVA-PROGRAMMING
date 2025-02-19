public class pattern {
    public static void main(String []args) {
        // for (int i = 0 ; i<5;i++){
        //     for ( int j =0 ; j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
            
        // }

        // for (int i=1;i<=4;i++){
        //     for (int j =1;j<=5;j++){
        //         if(i==1 || j==1 ||i==4 ||j==5){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
                
                
        //         }
            
            
        //     }
        //      System.out.println();
        
        // }
        // for (int i=1;i<=4;i++){
        //      for (int j =1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        
    //     for (int i=4;i>=1;i--){
    //         for(int j =1;j<=i;j++){
    //            System.out.print("*");
               

    //        }
    //        System.out.println();
    //    }

    // for (int i=1;i<=4;i++){
    //     for (int j=1;j<=4-i;j++){
    //         System.out.print(" ");
    //     }
    //     for (int k = 1 ; k<=i;k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for (int i=1;i<=4;i++){
    //          for (int j =1;j<=i;j++){
    //             System.out.print(j);

    //         }
    //         System.out.println();
    //     }
    // for (int i=4;i>=1;i--){
    //      for (int j =1;j<=i;j++){
    //          System.out.print(j+" ");
    
    //     }
    //     System.out.println();
    //  }
    // int number = 1;
    // for ( int i = 0 ; i <= 5; i++){
    //     for (int j = 0 ; j<=i ; j++){
    //         System.out.print(number+" ");
    //         number= number + 1;
            
    //     }
    //     System.out.println();
    //   }

    // for (int i=0;i<=5;i++){
    //     for (int j =0;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print("1");
    //         }else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    
        // for (int i = 0;i<=4;i++){
        //     for (int j =0;j<=i;j++){
        //         System.out.print("*");

        //     }int space=2*(4-i);
        //     for (int j=0; j<=space;j++){
        //         System.out.print(" ");
        //     }for (int j =0;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }
        // for (int i = 4;i>=0;i--){
        //     for (int j =0;j<=i;j++){
        //         System.out.print("*");

        //     }int space=2*(4-i);
        //     for (int j=0; j<=space;j++){
        //         System.out.print(" ");
        //     }for (int j =0;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }
        
        // for ( int i=0;i<=4;i++){
        //     int space = 4-i;
        //     for (int j =0;j<=space;j++){
        //         System.out.print(" ");
        //     } for (int j =0;j<=5;j++){
        //         System.out.print("*");
        //     }
                
            
        //     System.out.println();
        // }
        // for ( int i=0;i<=4;i++){
        //         int space = 4-i;
        //         for (int j =0;j<=space;j++){
        //             System.out.print(" ");
        //         } for (int j =0;j<=i;j++){
        //             System.out.print(i+" ");
        //         }
                    
                
        //         System.out.println();
        // }
        // for ( int i=1;i<=5;i++){
        //     int space = 5-i;
        //     for (int j =1;j<=space;j++){
        //         System.out.print(" ");
        //     } for (int j =i;j>=1;j--){
        //         System.out.print(j);
        //     } for (int j =2;j<=i;j++){
        //         System.out.print(j);
                
        //     }
        //     System.out.println();
        // }
        for ( int i=1;i<=5;i++){
            int space = 5-i;
            for (int j =1;j<=space;j++){
                System.out.print(" ");
            } for (int j =i;j>=1;j--){
                System.out.print("*");
            } for (int j =2;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }for ( int i=5;i>=1;i--){
            int space = 5-i;
            for (int j =1;j<=space;j++){
                System.out.print(" ");
            } for (int j =i;j>=1;j--){
                System.out.print("*");
            } for (int j =2;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}    
