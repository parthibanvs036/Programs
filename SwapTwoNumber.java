package Test;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1:- ");

		int num1 = sc.nextInt();

		System.out.println("Enter num2:- ");

		int num2 = sc.nextInt();                       

		System.out.println("\n***Before Swapping***");

		System.out.println("Number 1 : " + num1);

		System.out.println("Number 2 : " + num2);

		// Swap logic

		num1 = num1 + num2;

		num2 = num1 - num2;

		num1 = num1 - num2;

		System.out.println("\n***After Swapping***");

		System.out.println("Number 1 : " + num1);

		System.out.println("Number 2 : " + num2);
	}
}