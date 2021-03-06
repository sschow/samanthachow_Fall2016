/* Samantha Chow
 * 11/21/16
 * APCS1
 * FracCalc
 * 
 * FracCalc parses the first and second operand of multiple lines of input, until the user enters 'quit', 
 * and returns the parsed operand 2 to the screen.
 * The parts are 'whole:', 'numerator:', and 'denominator'. 
 * 
 */


package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter in a statement to calculate: ");
        String statement = userInput.nextLine();

    	while (!statement.equals("quit")){
    		System.out.println(produceAnswer(statement));
    		System.out.println("Enter in a statement to calculate: ");
        	statement = userInput.nextLine();        	
    	}

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        String firstOperand = "";
        String operator = "";
        String secondOperand = "";
        
        int firstWholeNumber;
    	int firstNumerator;
    	int firstDenominator;
    	
    	int secondWholeNumber;
    	int secondNumerator;
    	int secondDenominator;
    	
    	
        
        if(input.indexOf("+") > 0){
        	operator = "+";
        }else if(input.indexOf("-") > 0){
        	operator = "-";
        }else if(input.indexOf("/") > 0){
        	operator = "/";
        }else if(input.indexOf("*") > 0){
        	operator = "*";
        }
        String [] parts = input.split(operator);
    	firstOperand = parts[0];
    	secondOperand = parts[1];
    	
    	
    	//parsed operand 2
    	
    	//whole number
		if ((secondOperand.indexOf("/") == -1)){
			secondWholeNumber = Integer.parseInt(secondOperand);
			secondNumerator = 0;
			secondDenominator = 1;
		}
		//fraction
		else if ((secondOperand.indexOf("_") == -1) && (secondOperand.indexOf("/") > 0)){
			secondWholeNumber = 0;
			secondNumerator = Integer.parseInt(secondOperand.substring(0, secondOperand.indexOf("/")));
			secondDenominator = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/") + 1));
		}
		//mixed fraction
		else {
			secondWholeNumber = Integer.parseInt(secondOperand.substring(0,secondOperand.indexOf("_")));
			secondNumerator = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("_") + 1, secondOperand.indexOf("/")));
			secondDenominator = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/") + 1));
		}
		
    	
    	//parsed operand 1
		
    	//whole number
    	if ((firstOperand.indexOf("/") == -1)){
    		firstWholeNumber = Integer.parseInt(firstOperand);
    		firstNumerator = 0;
			firstDenominator = 1;
    	}
    	//fraction
    	else if ((firstOperand.indexOf("_") == -1) && (firstOperand.indexOf("/") > 0)){
    		firstWholeNumber = 0;
    		firstNumerator = Integer.parseInt(firstOperand.substring(0, firstOperand.indexOf("/")));
    		firstDenominator = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/") + 1));
    	}
    	//mixed fraction
    	else {
    		firstWholeNumber = Integer.parseInt(firstOperand.substring(0,firstOperand.indexOf("_")));
    		firstNumerator = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("_") + 1, firstOperand.indexOf("/")));
    		firstDenominator = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/") + 1));
    	}
    		
    	return "whole:" + secondWholeNumber + " numerator:" + secondNumerator + " denominator:" + secondDenominator;
    		
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
