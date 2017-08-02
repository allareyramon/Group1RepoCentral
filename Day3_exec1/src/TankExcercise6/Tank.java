package TankExcercise6;

public class Tank {

	int width;
	int height;
	int length;
	public boolean isfilled;
	boolean isterminate;
	public Tank(int l, int w, int h) {
		width = w;
		height = h;
		length = l;
		isfilled = false;
			
	}
	public void property() {
		System.out.println("Area : " + (width * length));
		System.out.println("Volume : " + (width * length * height));
	}
	
	public void filled(){
		System.out.println("Filling up tank.......");
		System.out.println("Tank Filled");
		isfilled = true;
	}
	public boolean emptied() {
		System.out.println("Emptying tank.............");
		System.out.println("tank is now empty");
		return isfilled = false;
	}	
	
	public boolean cleanup() {
		isterminate = Finalize();
		return isterminate;
		
	}
	public boolean Finalize() {
		if(isfilled)
			return true;
		else
		{
			System.out.println("Tank is Clean now");
			return false;
		}		
	}
}
	