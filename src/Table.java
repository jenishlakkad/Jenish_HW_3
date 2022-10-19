//8. WAP to print multiplication table for given number (for loop)


import java.util.*;//importing an inbuild class of Java
public class Table {

    public static void main(String[] args) {
        int x,y;//local variables, x and y

        Scanner dis=new Scanner(System.in);//obj of scanner an inbuild class
        System.out.println("Enter which table you want");
        x=dis.nextInt();//method for taking input form user
        System.out.println("And till which table");
        y=dis.nextInt();//method for taking input form user
        for (int i = x; i <=y ; i++)  //using For loop to make our conditions for table initialisation and end
        {
            System.out.println("  ");//For proper format
            System.out.println("The table of "+i+" is:= ");

            for (int j = 1; j <=10 ; j++) //using nested for loop to give condition in condition
            {
                    System.out.println(i+" x "+j+" = "+(i*j)); //Printing final output
            }

        }
    }
}

//Output for example:-
//Enter which table you want
//        8
//        And till which table
//        9
//        The table of 8 is:=
//
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        8 x 4 = 32
//        8 x 5 = 40
//        8 x 6 = 48
//        8 x 7 = 56
//        8 x 8 = 64
//        8 x 9 = 72
//        8 x 10 = 80
//        The table of 9 is:=
//
//        9 x 1 = 9
//        9 x 2 = 18
//        9 x 3 = 27
//        9 x 4 = 36
//        9 x 5 = 45
//        9 x 6 = 54
//        9 x 7 = 63
//        9 x 8 = 72
//        9 x 9 = 81
//        9 x 10 = 90
