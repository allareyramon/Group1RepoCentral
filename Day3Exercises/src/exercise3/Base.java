package exercise3;

public class Base  {

	public static void main(String args[]) {
		Rodents rod[] = {new Rodents("White",0),new Mouse("Black",15),new Gerbil("Red",10), new Hamster("Yellow",5)};
		
		for(int i = 0; i< rod.length; i++) {
			System.out.println(rod[i].getClass());
			System.out.println("Color: "+rod[i].getFur());
			System.out.println("Weight: "+rod[i].getWeight());
			System.out.print("Squeek: ");
			rod[i].squeek();
			System.out.println("\n");
			
		}
		
	}
	
}



class Rodents {
	
	String fur;
	int weight;
	public Rodents(String fur, int weight) {
		
		this.fur = fur;
		this.weight = weight;
	}
	
	public String getFur() {
		return fur;
	}
	public void setFur(String fur) {
		this.fur = fur;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void squeek() {
		System.out.println("Squeek!");
	}
	
	
}

class Mouse extends Rodents{

	public Mouse(String fur, int weight) {
		super(fur, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void squeek() {
		// TODO Auto-generated method stub
		System.out.println("RAWR!");
	}
	
	
}

class Hamster extends Rodents{

	public Hamster(String fur, int weight) {
		super(fur, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void squeek() {
		// TODO Auto-generated method stub
		System.out.println("Meow!");
	}
	
	
}
class Gerbil extends Rodents{

	public Gerbil(String fur, int weight) {
		super(fur, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void squeek() {
		// TODO Auto-generated method stub
		System.out.println("Arff!");
	}
	
	
}

