import java.util.*;
import java.io.*;

public class TempCalc {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("./resources/weather.txt"));
		double [] weather = new double[8];
		double difference = 0.0;
		for (int i = 0; i < weather.length; i++){
			weather[i] = input.nextDouble();
		}
		for (int i = 0; i < weather.length - 1; i++){
			difference = weather[i+1] - weather[i];
			System.out.println(weather[i] + " to " + weather[i+1] + ", change = " + difference);
		}
	}
}
