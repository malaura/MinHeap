import java.util.Scanner;


public class HeapDriver {

	public static Heap minH;

	/**
	 * Main method to get first input and perform BST operations.
	 * @param args
	 */
	public static void main(String[] args) {
		minH = new Heap();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter command:\n");
		String[] inputs = getInput(sc);
		performBSToperations(sc,inputs);
	}

	/**
	 * Method to loop until exit is entered.
	 * @param sc Scanner Object.
	 * @param inputs The instruction stored in a String array.
	 */
	private static void performBSToperations(Scanner sc, String[] inputs) {
		while(!inputs[0].equalsIgnoreCase("exit")){
			performNextBSTOperation(inputs);
			inputs = getInput(sc);
		}		
		System.out.println("\nExiting");
	}

	/**
	 * Method to identify a BST operation and perform it. 
	 * @param inputs The instruction stored in a String array.
	 */
	private static void performNextBSTOperation(String[] inputs) {
		if(inputs[0].equalsIgnoreCase("insert")){
			minH.insert(inputs[1]);
		}
		else if(inputs[0].equalsIgnoreCase("findMin")){
			minH.findMin();
		}
		else if(inputs[0].equalsIgnoreCase("removeMin")){
			minH.removeMin();
		}
		else if(inputs[0].equalsIgnoreCase("display")){
			minH.display();
		}
		else if(inputs[0].equalsIgnoreCase("exit")){	
		}
		else{
			System.out.println("\nInput should be in the format: command int\nCommand can be : insert, delete, search or exit.\n");
		}		
	}

	/**
	 * Helper function to get input from the user. This method splits the input and stores it in a String array. 
	 * @param sc Scanner Object.
	 * @return The string array. 
	 */
	public static String[] getInput(Scanner sc){
		String input = sc.nextLine();
		String[] inputs = input.split(" ");
		return inputs;
	}
}