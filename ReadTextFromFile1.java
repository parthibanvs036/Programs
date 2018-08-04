package Test;

import java.io.File;
import java.util.Scanner;

//Using Scanner class
//https://www.javatpoint.com/Scanner-class

public class ReadTextFromFile1 {     
	public static void main(String[] args) throws Exception
	{
		// pass the path to the file as a parameter
		File file = new File("F:\\Interview_Preparation\\Q&A\\Programs\\1 Program List.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}



// hasNextLine() method returns true if there is another line in the input of this scanner. This method may block while waiting for input. The scanner does not advance past any input.