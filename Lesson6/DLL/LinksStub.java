public class LinksStub {
	public static void main(String args[]) {
		Links link = new Links();
		for (int i = 0; i < 5; i++)
			link.addLast(i);

		link.displayNodesForward();
		link.displayNodesReverse();

		System.out.println("-----------------------------");

		for (int i = 0; i < 5; i++)
			link.addFront(i);

		link.displayNodesForward();
		link.displayNodesReverse();

	
		System.out.println("The total number of nodes: " + link.getSize());
	} 

} 
