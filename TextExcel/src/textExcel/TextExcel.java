package textExcel;


import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("Put in stuff: ");
		String declaration = input.nextLine();
		Spreadsheet data = new Spreadsheet();
	
		
		while (!declaration.equals("quit")) {
			//System.out.println(data.getGridText());
			System.out.println(data.processCommand(declaration));
    		System.out.println("Enter the stuff: ");
        	declaration = input.nextLine();
        	
		}
//		TestsALL.Helper th = new TestsALL.Helper();
//		System.out.println(th.getText());
	}
}
