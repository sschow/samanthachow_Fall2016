package textExcel;


import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String declaration = input.nextLine();
		Spreadsheet sheet = new Spreadsheet();
		while (!declaration.equals("quit")) {
			System.out.println(sheet.processCommand(declaration));
			
		}
			
	}
}