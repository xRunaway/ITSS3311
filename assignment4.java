//Please enter 5 elements of list 1!
//1
//2
//3
//4
//5
//Please enter 5 elements of list 1!
//1
//2
//3
//4
//5
//Two list are strictly identical!





import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		//declaring two different arrays
		int[] list1 = new int[5];
		int[] list2 = new int[5];

		//Setting the scanner
		Scanner input = new Scanner(System.in);
		//Outputing and asking the user to enter the numbers in the array
		System.out.println("Please enter 5 elements of list 1!");
		//Setting the for loop to cycle through the first array
		for(int i = 0; i < 5;i++) {
			list1[i] = input.nextInt();
		}
		//Outputing and asking the user to enter the numbers in the array
		System.out.println("Please enter 5 elements of list 1!");
		//Setting the for loop to cycle through the first array
		for(int i=0; i < 5;i++) {
			list2[i] = input.nextInt();
		}
		
		//Getting the information from the method 
		if (equals(list1, list2)) {
			//if the two are identical then it will output that they are
			System.out.println("Two list are strictly identical!");
		}else {
			//if the two are not identical then i will output that they are not
			System.out.println("Two list are not strictly identical!");
		}

	}

	//making a method to compare the two arrays
	public static boolean equals(int[] array1, int[] array2) {
		//setting the return value to true
		boolean equal = true;
		
		for(int i=0; i<5;i++) {
			if(array1[i] != array2[i]) {
				//if at any point they don't match up it will return false
				return false;

			}

		}
		//returns equal to the top
		return equal;

	}
}



