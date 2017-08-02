package punzagh_exec6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		Tank tank = new Tank();
		while(choice != 2) {
		System.out.println("Please choose what to do");
		System.out.println("[0]Fill Tank");
		System.out.println("[1]Empty Tank");
		System.out.println("[2]Clean Tank");
		System.out.println("Enter you choice");
		Scanner scan = new Scanner(System.in);
		
		try {
			choice = scan.nextInt();
			if(choice==0&&tank.isFilled) {
				System.out.println("Tank is already Filled!");
			}else if(choice==0&&!tank.isFilled) {
				tank.setFilled(true);
				System.out.println("Tank is now Filled");
			}
			if(choice==1&&tank.isFilled()) {
				tank.setFilled(false);
				System.out.println("Tank is now Empty");
			}else if (choice==1&&!tank.isFilled) {
				System.out.println("Tank is already Empty!");
			}
			if(choice==2) {
				tank = null;
				System.gc();
			}
			if(choice <0||choice >2) {
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Incorrect choice, please try again");
		}
		
		}
	}
	}
	
