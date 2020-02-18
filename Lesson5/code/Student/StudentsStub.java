import java.util.Arrays;
import java.util.Scanner;
public class StudentsStub{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students?");
		int count = scan.nextInt();
		Students obj[] = new Students[count];
		StudentsDriver driver = new StudentsDriver();
		driver.loadStudents(obj);
		driver.displayStudents(obj);
	}	
}