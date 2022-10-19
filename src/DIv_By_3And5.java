//7. WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

public class DIv_By_3And5 {


    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");		
		for (int i=1; i<100; i++) {      //using for loop to make our conditions
			if (i%3==0)    //If condition to print output
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<100; i++) {        //using for loop to make our conditions
			if (i%5==0) System.out.print(i +", ");	//If condition to print output
		}
    }
    
}

	//Output for example:-

//	Divided by 3:
//		3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
//
//		Divided by 5:
//		5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95,