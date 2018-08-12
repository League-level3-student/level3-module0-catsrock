package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] cats=new String[5];
		cats[0]="saphie";
		cats[1]="simba";
		cats[2]="snoopy";
		cats[3]="sol";
		cats[4]="snark";
		//2. print the third element in the array

		//3. set the third element to a different value

		//4. print the third element again
	System.out.println(cats[2]);	
		//5. use a for loop to set all the elements in the array to a string of your choice
	
	for (int i = 0; i < cats.length; i++) {
		String[] doges=new String[cats.length];
		doges[i]="mop dog";
		System.out.println(doges[i]);
	}	
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
int[] snek=new int[50];
		//8. use a for loop to make every value of the integer array a random number
for (int i = 0; i < snek.length; i++) {
	Random sock=new Random();
	int hiss=sock.nextInt(snek.length);
	snek[i]=hiss;
	System.out.println("0"); //step 9
	//System.out.println(snek.length); //step 11
	//System.out.println(snek[i]); //step 10
	//System.out.println(snek[snek.length-1]); //step 12
}
		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
