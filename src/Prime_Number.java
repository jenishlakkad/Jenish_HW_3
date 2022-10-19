//3) WAP to check if given number is Prime number or not?

import java.util.*;//importing an inbuild class of Java
public class Prime_Number {
    public static void main(String[] args) {
        int x,count=0;  //local variables, x and count
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.print("Enter any number:- ");
        x=dis.nextInt(); //method for taking input form user
        for (int i = 1; i <=x ; i++) { //Initialization,Condition and increment by for loop to check a entered no is prime or not.
            if(x%i==0){   //Condition by using if for x have 0 reminder or not
                count++;   // to increment
            }
        }
        if(count==2){   // to check count is equal to 2 or not
            System.out.println(x+" is a Prime number");  // Print statement
        }
        else {
            System.out.println(x+" is not a Prime number");
        }
    }

    public static class _Table {
    }
}


//Output for example:-

//    Enter any number:- 17
//        17 is a Prime number