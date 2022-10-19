//15. Printing out multiplication table using DO WHILE loop
//        1 2 3
//        2 4 6
//        3 6 9
//        4 8 12
//        5 10 15
//        6 12 18
//        7 14 21

import java.util.*;
public class Table_DoWhile {
    public static void main(String[] args) {


        int table=1,n2=1,table2=2,n=1,table3=3,n3=1; //local variables
        do {                               //using Do While loop to make our conditions
            System.out.println(table*n2);  //print output
            n2=n2+1;
           }

        while (n2<=10);
        do {
            System.out.println(table2*n);
            n=n+1;
        }
        while (n<=10);
        do {
            System.out.println(table3*n3);
            n3=n3+1;
        }
        while (n3<=10);

    }
}

//Output for example:-
//1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        2
//        4
//        6
//        8
//        10
//        12
//        14
//        16
//        18
//        20
//        3
//        6
//        9
//        12
//        15
//        18
//        21
//        24
//        27
//        30