import java.util.Arrays;

public class LotsOfCopies {
	public static void main (String [] args){
		int num = 7;
		String strMain = "APCS";
		int [] arrMain = {1, 2, 3, 4, 5};
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain);
		changeMe(num, strMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain);
	}
	
	public static void changeMe(int x, String str, int [] arr){
		x = 12;
		str = "New String";
		arrMain = {2, 4, 6, 8, 10};
	}
}