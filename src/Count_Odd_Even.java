//11. WAP to input any five digit number and then count total number of odd and even digit and find out
//        sum of them


import java.util.*; //importing an inbuild class of Java
public class Count_Odd_Even {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in); //obj of scanner an inbuild class
        System.out.print("Enter any five digit number:=");
        int num=dis.nextInt(); //method for taking input form user
        int count_even=0; //local variables
        int count_odd = 0; //local variables
        int sum_even=0; //local variables
        int sum_odd = 0; //local variables
        int rem = 0; //local variables
        while(num>0)  //using while loop to make our conditions
        {
            rem=num%10;
            if(rem%2==0)//If condition to print output
            {
                sum_even = sum_even+rem;
                count_even++;
            }
            else
            {
                sum_odd=sum_odd+rem;
                count_odd++;
            }
            num=num/10;
        }   //To print Output:=
        System.out.println("Total even digits : "+count_even);
        System.out.println("Sum of even digits : "+sum_even);
        System.out.println("Total odd digits : "+count_odd);
        System.out.println("sum of odd digits : "+sum_odd);
    }
    }



    //Output for example:-
//
//    Enter any five digit number:=75364
//        Total even digits : 2
//        Sum of even digits : 10
//        Total odd digits : 3
//        sum of odd digits : 15
