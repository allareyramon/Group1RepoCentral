package ITA.eh;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Sum {
	public static void main(String[] args) {


			System.out.print("\nEnter number: ");
			
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();


				for(int i = 1 ; i<num; i++) {
					for(int j = i ; j<num; i++) {
						int sum = i/num + j/num;
						System.out.print(sum);
					}
				}

		}

	}



	
	

