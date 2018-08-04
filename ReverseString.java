package Test;

import java.util.Scanner;

public class ReverseString{

public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter String to Reverse:- ");

	String str = sc.nextLine();                       

	int i = str.length();

	StringBuffer strb = new StringBuffer();

	for (int j = i - 1; j >= 0; j--) {

		strb = strb.append(str.charAt(j));
	}

	System.out.println(strb);
}
}