package TankExcercise6;

public class tankClass {
	
	public boolean isfilled = true;
	public tankClass() {
		
	}
	
	public void fill() {
		isfilled = true;
	}
	
	public void empty() {
		isfilled = false;
	}
	public void clean() {
		if(isfilled == true) {
			System.out.println("cannot clean");
		}
		else 
			System.out.println("Cleanable");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(isfilled)
			System.out.println("tank is still filled");
		else
			System.out.println("Tank is thrown");
	}

	
	


}
