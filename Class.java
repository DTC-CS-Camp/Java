import java.io.*;
import java.util.*;

public class Class {
	
	
	public static void Problem1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input (integer): ");
		int temperature = sc.nextInt();
		//EDIT CODE BELOW \/
		
		if (temperature < 1) System.out.println("nothing");
		else System.out.println("snowball fight!");
		
		//EDIT CODE ABOVE /\
	}
	
	public static void Problem2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input (lower): ");
		double lower = sc.nextDouble();
		System.out.println("Input (upper): ");
		double higher = sc .nextDouble();
		int guess = 0; 
		//you have to find a winning guess using lower, higher, conditionals, and loops
		//ADD CODE BELOW \/
		
		if (lower <= 1) guess = 2;
		
		//ADD CODE ABOVE /\
		System.out.println("Guess: " + guess); 
	}
	
	public static void BonusProblem() {
		//Don't be worried if this problem is hard right now!
		//It uses something we're learning tomorrow :)
		//To get the bonus point, you must use a maximum of THREE loops
		//to print the wanted output. 
		
		//Good luck!
		
		//ADD CODE BELOW \/
		
		
		//ADD CODE ABOVE /\
	}
	
	
	public static void main(String[] args) {
		/*PROBLEM 1
		 *test cases for Problem 1.
		 *when you're ready, uncomment the line below (with a regular comment), 
		 *and then click the play button. Type a number and then hit enter. 
		 *(remember, the number must be an integer)
		 *once you think your program is working, call an instructor or TA to test it
		**/
		//Problem1();
		
		/*PROBLEM 2
		 *test cases for Problem 2.
		 *when you're ready, uncomment the line below (with a regular comment), 
		 *and then click the play button. First, type a lower bound and then hit enter. 
		 *Then, type an upper bound and hit enter.
		 *(remember, the numbers must be doubles between 10 and 20)
		 *once you think your program is working, call an instructor or TA to test it
		**/
		//Problem2();
	}
}
