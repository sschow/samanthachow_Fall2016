/**
 * @author Samantha Chow
 *
 */
public class Calculate {

	public static double square(double num){
		double answer;
		answer = (num*num);
		return answer;
	}
	public static double cube(double num){
		double answer;
		answer = (num*num*num);
		return answer;
	}
	public static double average(double x, double y){
		double answer;
		answer = ((x+y)/2);
		return answer;
	}
	public static double average(double i, double j, double k){
		double answer;
		answer = ((i+j+k)/3);
		return answer;
	}
	public static double toDegrees(double num){
		double answer;
		answer = (num*(180/3.14159));
		return answer;
	}
	public static double toRadians(double num){
		double answer;
		answer = (num*(3.14159/180));
		return answer;
	}
	public static double discriminant(double a, double b, double c){
		double answer;
		answer = ((b*b)-(4*a*c));
		return answer;
	}
}