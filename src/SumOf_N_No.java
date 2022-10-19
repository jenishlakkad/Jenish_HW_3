//6. WAP to display sum of n Natural number

import java.util.Scanner;//importing an inbuild class of Java

public class SumOf_N_No {

    public static void main(String[] args) {
        int n;//local variables
         int sum=0;//local variables
       Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
       System.out.print("Enter any Natural Number:=");
       
       n=dis.nextInt();//method for taking input form user
       
       for(int i=1;i<=n;i++)//using while loop to make our conditions
       {
           sum=sum+i;
       }
        System.out.println("Sum of natural number "+sum);
    }
    
}
//Output for example:-
//Enter any Natural Number:=5
//        Sum of natural number 15