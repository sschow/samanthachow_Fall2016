/**Samantha Chow
 * APCS 1
 * 9/24/16
 * 
 * 
 * This class calls all the functions of the Calculate class and prints the evaluations to the console
 * window. 
 */
public class DoMath {

	public static void main(String[] args) {
		
//part 1
		double square = Calculate.square(5.0);
		System.out.println(square);
		
		double cube = Calculate.cube(3.0);
		System.out.println(cube);
		
		double average = Calculate.average(2.0, 4.0);
		System.out.println(average);
		
		double threeAverage = Calculate.average(2.0,3.0,4.0);
		System.out.println(threeAverage);
		
		double degrees = Calculate.toDegrees(2.356);
		System.out.println(degrees);
		
		double radians = Calculate.toRadians(134.98);
		System.out.println(radians);
		
		double discriminant = Calculate.discriminant(1.0, 2.0, 3.0);
		System.out.println(discriminant);
		
		String improperFrac = Calculate.toImproperFrac(3, 1, 2);
		System.out.println(improperFrac);
		
		String mixedNum = Calculate.toMixedNum(-9,3);
		System.out.println(mixedNum);
		
		String foiled = Calculate.foil(2, -3, -6, 7, "n");
		System.out.println(foiled);
		
//part 2
		boolean divisible = Calculate.isDivisibleBy(10, 2);
		System.out.println(divisible);
		
		double absValue = Calculate.absValue(-4.0);
		System.out.println(absValue);
		
		int maximum = Calculate.max(10, 5);
		System.out.println(maximum);
		
		double maximumNum = Calculate.max(12.0, 61.84, 107.9);
		System.out.println(maximumNum);
		
		int minimum = Calculate.min(12, 2);
		System.out.println(minimum);
		
		double rounded = Calculate.round2(32.6768);
		System.out.println(rounded);
		
//part 3
		double exponential = Calculate.exponent(2.0, 3);
        System.out.println(exponential);
        
        int factorial = Calculate.factorial(3);
        System.out.println(factorial);
        
        boolean primeNum = Calculate.isPrime(7);
        System.out.println(primeNum);
        
        int gcfactor = Calculate.gcf(32, 8);
        System.out.println(gcfactor);
        
        double squareRoot = Calculate.sqrt(4.0);
        System.out.println(squareRoot);
        
//part 4 
        String quadraticFormula = Calculate.quadForm(2, 6, 3);
        System.out.println(quadraticFormula);
	}
}
