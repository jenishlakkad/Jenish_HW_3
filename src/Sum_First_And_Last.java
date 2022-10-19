//14. WAP to input any five digit number and then find sum of first and last digit


import java.util.*;//importing an inbuild class of Java

public class Sum_First_And_Last {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);  //obj of scanner an inbuild class
        System.out.print("Enter any number:=");
        int f= dis.nextInt();//local variables f  //method for taking input form user
        int l=f%10;  //local variables l
        while (f>9){  //using while loop to make our conditions
            f=f/10;
        }
        int sum=f+l;//local variables sum
        System.out.println("The sum of the first and last digit is :- " +sum);
    }
}

//Output for example:-

//    Enter any number:=456
//        The sum of the first and last digit is :- 10