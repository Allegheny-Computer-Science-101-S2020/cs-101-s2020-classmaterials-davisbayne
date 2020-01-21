import java.util.Scanner;
public class Days{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 (inc):");
		int day = in.nextInt();
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			default:
				System.out.println("Invalid day ...");
				break;
		}
		
	}
}