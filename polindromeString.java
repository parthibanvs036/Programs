package Test;

import java.util.Scanner;

public class polindromeString {

	public static void main(String[] args) {
		String reverse = "";

		System.out.println("Enter the input String");
		Scanner scanObj = new Scanner(System.in);
		String str = scanObj.nextLine();
		int length = str.length();

		for(int i=length-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("YES IT IS A PALINDROME");
		}
		else
		{
			System.out.println("No IT IS NOT A PALINDROME");
		}
	}
}