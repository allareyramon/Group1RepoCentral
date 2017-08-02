package exercise5;

public class Main {
	
	public static void main(String args[]) {
		dog d = new dog();
		
		d.bark();
		d.bark(9);
		d.bark("Much Wow");
		d.bark(true);
		
	}
	
}

class dog {

	public void bark() {
		System.out.println("Arf!");
	}

	public void bark(int x) {
		System.out.println("Roar!");
	}

	public void bark(String x) {
		System.out.println("Bark!");
	}

	public void bark(boolean x) {
		System.out.println("Ruff!");
	}

}