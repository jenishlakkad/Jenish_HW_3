//2. Print the sequence for fibonacci series for given limitation n - for eg 1 1 2 3 5 8 13 21


import java.util.*;  //importing an inbuild class of Java
public class Fibonacci_Series {

    public static void main(String[] args) {
        int len,x=0,y=1,z;  //local variables
        Scanner dis=new Scanner(System.in);  //obj of scanner an inbuild class
        System.out.print("Enter the length of Series:-");  //Take the length of series form user.
        len= dis.nextInt();  //user input
        for (int i = 1; i <=len ; i++)  //Initialization,Condition and increment by for loop
        {
            System.out.print(x+" ");
            z=x+y;
            x=y;
            y=z;
        }
    }
}

//Output for example:-
//    Enter the length of Series:-
//        10
//        0 1 1 2 3 5 8 13 21 34