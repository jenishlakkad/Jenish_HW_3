//1. Print any 10 numbers between given/user input range. FOr eg.. between 23-33

import java.util.*;//importing an inbuild class of Java
public class Print_10_Numbers {
    public static void main(String[] args) {
        int n1,n2;//local variables, n1 and ne
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.println("enter two number");
        n1=dis.nextInt();//method for taking input form user
        n2=dis.nextInt();//method for taking input form user

        for(int i=n1;i<=n2;i++) //Initialization,Condition and increment by for loop to check a entered no is prime or not.
        {
            for(int j=n1;j<=n2;j++)//using for loop again
                if(i==j)
                {
                    System.out.println(j);
                }
        }
    }
}
//Output for example:-
//23
//        24
//        25
//        26
//        27
//        28
//        29
//        30
//        31
//        32
//        33