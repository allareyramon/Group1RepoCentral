package exercise6;

class Tank {
	boolean filled = false;

	public void fill() {
		filled = true;
	}

	public void empty() {
		filled = false;
	}

	@Override
	protected void finalize() {
			System.out.println("You're throwing away a full tank of nothing!");
	}
}

public class Main {
	public static void main(String[] args) {
		
		Tank t = new Tank();
		System.out.println("Fullness is " + t.filled );
		t.fill();
		System.out.println("Fullness is " + t.filled);
		//System.gc(); // A full tank is being marked for garbage collection
		new Tank();
//		System.gc();
		System.out.println("Fullness is " + t.filled);
		t.empty();
		System.out.println("Fullness is " + t.filled);
//		System.gc(); // An empty tank is being marked for garbage collection, so no message folks
		
		t = null;
		System.gc();
		
		
		System.out.println("you are here");
	}
}
