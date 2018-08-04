package Test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String args[]) {

		int r, sum = 0, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No to Check Palindrome or Not:");

		int n = sc.nextInt();

		temp = n;

		while (n > 0) {

			r = n % 10; // getting remainder

			sum = (sum * 10) + r;

			n = n / 10;

		}

		if (temp == sum)

			System.out.println("No is Palindrome");

		else

			System.out.println("No is Not Palindrome ");
	}
}