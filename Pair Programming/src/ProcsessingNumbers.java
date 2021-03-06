import java.util.*;

/**
 *Samantha Chow
 *10/2/16
 *APCS1
 *Processing Numbers Pair Programming
 *
 *This method accepts a user input of the number of numbers to take into account, then determines
 *the maximum number, minimum number, and the sum of all the even numbers received. 
 *Partner 1: Samantha Chow
 *Partner 2: Patrick Tan
 */
public class ProcsessingNumbers {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int nextNum;
		int total = 0;
		int min = 1000000000;
		int max = 0;
		System.out.println("How many numbers do you want to input?");
		int loopTimes = userInput.nextInt();
		for(int i = 1; i <= loopTimes; i++){
			System.out.println("Enter a number: ");
			nextNum = userInput.nextInt();
			if(nextNum > max){
				max = nextNum;
			}
			if (nextNum < min){
				min = nextNum;
			}
			if(nextNum % 2 == 0){
				total += nextNum;
			}
		}
		System.out.println("The maximum value is " + max + " the minimum value is " + min
				+ " the total of all even numers is " + total );
	}
}