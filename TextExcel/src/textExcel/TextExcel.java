package textExcel;


import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String cellDeclaration = input.nextLine();
		System.out.println(Spreadsheet.processCommand(cellDeclaration));
		// Add your command loop here
	}
}
