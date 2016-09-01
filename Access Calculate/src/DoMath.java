/**
 * 
 */

/**
 * @author Samantha Chow
 *
 */
public class DoMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}
	

}
