//5. WAP to find a factorial for given number For eg. entered number is 5.

import java.util.*;//importing an inbuild class of Java
public class Factorial {
    public static void main(String[] args) {
        int x,f=1;//local variables, x and f
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.println("Enter any number");
        x=dis.nextInt();//method for taking input form user
        for (int i = 1; i <=x ; i++) {    //using loop to make our conditions
            f=f*i;
        }
        System.out.println("Factorial "+f);
    }
}


//Output for example:-

//    Enter any number
//        7
//        Factorial 5040