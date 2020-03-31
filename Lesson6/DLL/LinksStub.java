import java.util.Scanner;

public class LinksStub {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Links link1 = new Links();
		for (int i = 0; i < 5; i++)
			link1.addLast(i);

		link1.displayNodesForward();
		link1.displayNodesReverse();

		System.out.println("-----------------------------");

		Links link2 = new Links();

		for (int i = 0; i < 5; i++)
			link2.addFront(i);

		link2.displayNodesForward();
		link2.displayNodesReverse();

	
		System.out.println("The total number of  for link 1: " + link1.getSize());
		System.out.println("The total number of  for link 2: " + link2.getSize());
		System.out.println("-----------------------------");

		while(true){
			System.out.println("Tell me the node you would like to delete: ");
			int prompt = scan.nextInt();
			link1.deleteNode(prompt);
			link1.displayNodesForward();

			System.out.println("Do you want to delete again(y/n)? ");
			char repeat = scan.next().toLowerCase().charAt(0);
			if (repeat == 'y')
				continue;
			else
				break;
		}
	} 

} 
