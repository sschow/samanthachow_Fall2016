
public class Hourglass {
	public static void main(String[] args) {
		//print line 1
		lineWithQuotes();
		//print the top half
		printTopHalf();
		//print line 6 (middle)
		System.out.println("     ||");
		//print bottom half
		printBottomHalf();
		//print last line (looks just like line 1)
		lineWithQuotes();
	}


	public static void lineWithQuotes(){
		System.out.print("|");
		for(int j = 0; j<10; j++){
			System.out.print("\"");
		}
		System.out.println("|");	
	}	


	public static void printTopHalf(){
		for (int i=1; i<=4;i++){ //print the first 4 lines
			//Print the spaces
			for (int s=1; s<=i;s++){
				System.out.print(" ");
			}
			//Print the \
			System.out.print("\\");
			// Print the colons
			for (int c=1; c<=10-2*i;c++){
				System.out.print(":");
			}
			//Print the /
			System.out.println("/");
		}
	}


	public static void printBottomHalf(){
		for (int i=4; i>=1;i--){ //print the first 4 lines
			//Print the spaces
			for (int s=1; s<=i;s++){
				System.out.print(" ");
			}
			//Print the \
			System.out.print("/");
			// Print the colons
			for (int c=1; c<=10-2*i;c++){
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
}
