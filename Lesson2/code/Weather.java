import java.util.Scanner;
public class Weather{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		int temp = in.nextInt();
		if (temp >= 80)
			System.out.println("It's Hot...");
		else if (temp > 60 && temp < 80)
			System.out.println("It's nice weather ...");
		else
			System.out.println("It's cold ...");
	}
}