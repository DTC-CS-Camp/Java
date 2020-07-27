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
}
