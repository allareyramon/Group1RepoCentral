package ITA.exercise6a;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Tank {
	static boolean filledTank;
	public static void main(String[] args) {

		Tank t = new Tank();

		System.out.println("\nTANK \n");

		filledTank = false;
		String choice = "e";
		String prevchoice;
		
		System.out.println("Choose an action: \n");
		System.out.println("F - Fill ");
		System.out.println("E - Empty ");
		System.out.println("C - Clean \n");

		while (!choice.equalsIgnoreCase("c")) {

			System.out.print("\nEnter your choice: ");
			prevchoice = choice;
			choice = new Scanner(System.in).nextLine();

			try {

				// System.out.println("prevchoice: " + choice + "\n");

				if (choice.equalsIgnoreCase("f")) {
					filledTank = t.filled();
				} else if (choice.equalsIgnoreCase("e")) {
					filledTank = t.emptied();
				} else if (choice.equalsIgnoreCase("c")) {
				
					//t.finalize(prevchoice, filledTank);
			
					if (filledTank == true) {
						t = null;
						System.gc();
					}
		
					else if (filledTank == false) {		
						System.out.println("\nTank is now cleaned.");
						System.out.println("\n------------------------------");
					}
					
					
				} else {
					System.out.println("\nWrong choice");
					System.out.println("\n------------------------------.");
				}
				
				//System.out.println("filledTank: " + filledTank);

			} catch (Exception e) {
				e.getMessage();
			}
		}

	}

	public boolean filled() {

		System.out.println("\nTank is now filled with water.");
		System.out.println("\n------------------------------");
		return true;
	}

	public boolean emptied() {

		System.out.println("\nTank is now empty.");
		System.out.println("\n------------------------------");
		return false;
	}

//	public void finalize(String pC, boolean filledTank) {
//
//		if (pC.equalsIgnoreCase("f") && filledTank == true) {
//			System.out.println("\nTank must be empty in order to clean it.");
//			System.out.println("\n------------------------------");
//		}
//
//		else if (pC.equalsIgnoreCase("e") && filledTank == false) {
//			System.out.println("\nTank is now cleaned.");
//			System.out.println("\n------------------------------");
//		}
//
//	}
	
	
	public void finalize() {
		if(filledTank) {
		System.out.println("\nTank must be empty in order to clean it.");
		System.out.println("\n------------------------------");
		}
	}
	
	
}
