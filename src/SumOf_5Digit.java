//10. WAP to input any five digit number and then find sum of each digit

import java.util.*;//importing an inbuild class of Java

public class SumOf_5Digit {

    public static void main(String[] args) {
        int n,a;  //local variables n and a
        int sum=0;  //local variables sum
        
        System.out.println("Enter any five digit");
        Scanner dis=new Scanner(System.in);  //obj of scanner an inbuild class
        n=dis.nextInt();  //method for taking input form user
        
        while(n>0)  //using while loop to make our conditions
        {
          a=n%10;
          sum=sum+a;
          n=n/10;
        }
        System.out.println("sum of digit "+sum);  //print output
    }
    
}


//Output for example:-
//Enter any five digit
//45632
//        sum of digit 20