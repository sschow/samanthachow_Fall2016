/**
 * @author Samantha Chow
 *
 */
public class Calculate {
	
//part 1
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
	public static String toImproperFrac(int i, int j, int k){
		int ik = i*k;
		int numerator = ik + j;
		return numerator + "/" + k;
	}
	public static String toMixedNum(int x, int y){
		int wholeNum;
		wholeNum = x / y;
		int xModY = x % y;
		return wholeNum + "_" + xModY + "/" + y;
	}
//	public static String foil(int a, int b, int c, int d, String x){
//		int first = "(a*b)" + x;
//		int second = 
//	int third = 
//	}
//part 2
//	public static boolean isDivisibleBy(int x, int y){
//		if (x % y == 0){
//			return true;
//	}
	public static double absValue(double num){
		if (num > 0){
			return num;
		}else{
			return -(num);
		}
	}
	public static int max(int x, int y){
		if (x > y){
			return x;
		}else{
			return y;
		}
	}
	public static double max(double a, double b, double c){
		if (a > b && a > c){
			return a;
		}else if (b > a && b > c){
			return b;
		}else{
			return c;
		}
	}
	public static int min(int x, int y){
		if (x < y){
			return x;
		}else{
			return y;
		}
	}
//	public static double round2(double num){
//		
//	}
}