package main_exec1;

class Unicylce extends Cycle{

	public void balance()
	{
		System.out.println("hard");
	}
}

class Bicycle extends Cycle{

	public void balance()
	{
		System.out.println("not too hard");
	}
	
}

class Tricycle extends Cycle{

}

public class Main_exec1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle[] objCycle = new Cycle[3];
		objCycle[0] =  (Cycle) new Unicylce();
		objCycle[1] = (Cycle) new Bicycle();
		objCycle[2] = (Cycle) new Tricycle();
		String[] stringCycle = {"Unicycle", "Bicycle","TriCycle"};
		
		for (int x = 0; x< 3; x++) {
			objCycle[x].ride(stringCycle[x]);
			//Excercise2
			//objCycle[x].balance();    //--Method balance is Undefined (Syntax Error)
			System.out.println("xxxxxxxxxxxxxxxxxx");
		}
		
		System.out.println("------------DownCast---------------" + "");
		((Unicylce) objCycle[0]).balance();
		((Bicycle) objCycle[1]).balance();
		//((Tricylce) objCycle[2]).balance(); // method balance does not exist in Tricycle class (Syntax Error)
		
	}
}
