//9. WAP to enter any String and count total numbers of &#39;a&#39; in that String

import java.util.*;//importing an inbuild class of Java

public class Count_A {


    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.print("Enter String:=");
         String s = dis.nextLine();//local variables s //method for taking input form user

         int count = 0;    //local variables count

        //Counts each character except space    
        for(int i = 0; i < s.length(); i++) {        //using for loop to make our conditions
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'A')  //If condition to  check alphabet
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of 'a' characters in a string: " + count);
    }
    
}

//Output for example:-
//Enter String:=Krisa
//        Total number of 'a' characters in a string: 1
