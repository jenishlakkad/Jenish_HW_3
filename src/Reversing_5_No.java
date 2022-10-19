//4. WAP to input the 5 digit number and then reverse it

import java.util.*;//importing an inbuild class of Java
public class Reversing_5_No {
    public static void main(String[] args) {
        int x,y; //local variables, x and y
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.print("Enter any 5 digit no.:- ");
        x=dis.nextInt();//method for taking input form user


        while (x>0){  //using while loop to make our conditions
            y=x%10;
            System.out.print(y);
            x=x/10;
        }
    }
}
//Output for example:-
//Enter any 5 digit no.:- 45632
//        23654