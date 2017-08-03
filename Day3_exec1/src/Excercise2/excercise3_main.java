package Excercise2;
class Mouse extends Rodent
{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
	
			System.out.println("mouse: walk");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
			System.out.println("mouse: Eat");
	}
	
}


class Hamster extends Rodent
{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Hamster: walk");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Hamster: eat");
	}
	
}
public class excercise3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rodent R[] = new Rodent[2];
		R[0] = new Hamster();
		R[1] = new Mouse();
		
		for (int x = 0; x<2; x++)
		{
			R[x].eat();
			R[x].walk();
			System.out.println("------------------");
		}
		
		}

}
//allows the array of base object to store the extended objects.
