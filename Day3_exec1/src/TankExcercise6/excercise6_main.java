package TankExcercise6;

public class excercise6_main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//

		methodtry();
		
	}
	
	public static void methodtry()
	{
		tankClass ObjTank = new tankClass();
		ObjTank.fill();
		System.out.println("Tank filled = " + ObjTank.isfilled);
		ObjTank.clean();
		
		ObjTank.empty();//tank is now empty
		System.out.println("Tank is filled = " + ObjTank.isfilled);
		ObjTank.clean();
		ObjTank = null; 
	
		
		System.gc(); //clean Tank
		
		
		tankClass ObjTank1 = new tankClass();
		ObjTank1 = new tankClass(); //instantiate tank again 
		ObjTank1.fill();//
		System.out.println("Tank is filled = " + ObjTank1.isfilled);
		ObjTank1.clean();
		System.gc();
				
	
	}
	
	


}
