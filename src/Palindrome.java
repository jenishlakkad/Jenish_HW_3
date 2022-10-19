//12. WAP to input any number and check if its Palindrome or not?

import java.util.*;//importing an inbuild class of Java

public class Palindrome {

    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.println("Enter String ");
        String s1=dis.nextLine();//local variables s1 //method for taking input form user
        String c1="";//local variables c1
        for (int x=s1.length()-1;x>=0;x--)//using for loop to make our conditions
        {
        c1=c1+s1.charAt(x);
        }
        if(s1.equals(c1))
        {
        System.out.println("Palindrome ");
        }
        else
        {
        System.out.println("not Palindrome ");
        }
    }
    
}

//Output for example:-
//Enter String
//    level
//            Palindrome