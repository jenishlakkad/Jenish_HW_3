//13. WAP to input any number and find out if its Armstrong number or not?

import java.util.*;//importing an inbuild class of Java
public class Armstrong {
    public static void main(String[] args) {
        int x,arm=0,rem,y,z;//local variables, x,arm,rem,y,z
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.print("Enter any number:=");
        x= dis.nextInt();//method for taking input form user
        y=x;
        z=x;
        while (x>0)//using while loop to make our conditions
        {
            rem=x%10;
            arm=(rem*rem*rem)+arm;
            x=x/10;
        }
        if (y==arm){  //If condition to print output
            System.out.println(z+" is an Armstrong number.");
        }
        else {
            System.out.println(z+" is not an Armstrong number");
        }
    }
}
//Output for example:-

//    Enter any number:=153
//        153 is an Armstrong number.