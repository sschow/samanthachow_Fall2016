import java.util.*;

/**
 * @author Samantha Chow
 *
 */
public class ProcsessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int nextNum;
		int total = 0;
		int min = 0;
		int max = 0;
		System.out.println("How many numbers do you want to input?");
		int loopTimes = userInput.nextInt();
		for(int i = 1; i <= loopTimes; i++){
			System.out.println("Enter a number: ");
			nextNum = userInput.nextInt();
			if(nextNum > max){
				max = nextNum;
			}else if (nextNum < min){
				min = nextNum;
			}
			if(nextNum % 2 == 0){
				total += nextNum;
			}
		}
		System.out.println("The max value is " + max + "the min value is " + min
				+ "the total of all even numers is " + total );
		
	}

}