package textExcel;


import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{
	

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        System.out.println("Put in stuff: ");
		String declaration = input.nextLine();
		Spreadsheet sheet = new Spreadsheet();
	
		String letters = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";

		System.out.print("   ");
		for (int i = 0; i < 12; i++){
			System.out.print("|" + letters.charAt(i) + "         ");
		}	        
		System.out.println("|");
		int counter = 0;
		for(int j = 0; j < 20 ; j++){
			counter++;
			if (counter < 10){
				System.out.print(counter + "  ");
			}else{
				System.out.print(counter + " ");
			}
			for(int k = 0; k < 12 ; k++ ){	
				System.out.print("|");
				for(int a = 0; a < 10; a++){
					System.out.print(" ");
				}
			}
			System.out.println("|");
		}
		
		while (!declaration.equals("quit")) {
			System.out.println(sheet.processCommand(declaration));
    		System.out.println("Enter the stuff: ");
        	declaration = input.nextLine();  
		}
		//TestsALL.Helper th = new TestsALL.Helper();
		//System.out.println(th.getText());
	}
}
