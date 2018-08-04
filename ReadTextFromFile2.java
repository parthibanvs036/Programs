package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Using BufferedReader  
//https://www.javatpoint.com/java-bufferedreader-class

public class ReadTextFromFile2 {           


	public static void main(String[] args)throws Exception
	{			
		File file = new File("F:\\Interview_Preparation\\Q&A\\Programs\\1 Program List.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}
}


//Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class