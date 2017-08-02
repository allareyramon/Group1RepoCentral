package punzagh_exec2;

public class Main {

	public static void main(String[] args) {
		Cycle cycle = new Cycle();
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
		Unicycle unicycle = new Unicycle();
		
		//The method balance() is undefined for the type Cycle
		//since Cycle has no balance method, but if Cycle has balance method it will display value except for
		//tricycle since it has no balance method
		Cycle cycle2[] = {bicycle,tricycle,unicycle};
//		for(int i = 0;i<3;i++) {
//			cycle2[i].balance();
//		}
		
		//since tricycle has no balance method, it will not run successfully
		for(Cycle cycles: cycle2) {
			if(cycles.toString() == "Unicycle Class Ride"){
					Unicycle unicycle2 = (Unicycle) cycles;
					unicycle2.balance();
			}else if(cycles.toString() == "Bicycle Class Ride"){
				Bicycle bicycle2 = (Bicycle) cycles;
				bicycle2.balance();
			}else if(cycles.toString() == "Tricycle Class Ride"){
				Tricycle tricycle2 = (Tricycle) cycles;
				//tricycle2.balance();
		}
		}

		

	}

}
