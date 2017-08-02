package exercise1;

public class Main {
	
	public static void main(String[] args) {
		Cycle b = new Bicycle();
		Cycle u = new Unicycle();
		Cycle t = new Tricycle();
		
		b.ride();
		u.ride();
		t.ride();
	}

}


class Cycle{
	protected String type = "Cycle";
	
	protected void ride() {
		System.out.println("I am a " + type);
	}
}

class Bicycle extends Cycle{
	Bicycle(){
		type = "Bicycle";
	}
}

class Unicycle extends Cycle{
	Unicycle(){
		type = "Unicycle";
	}
}

class Tricycle extends Cycle{
	Tricycle(){
		type = "Tricycle";
	}
}
