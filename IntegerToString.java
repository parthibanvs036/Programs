package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IntegerToString { 

	public static void main(String args[]){  
		int i=200;  
		String s=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
	}
}  