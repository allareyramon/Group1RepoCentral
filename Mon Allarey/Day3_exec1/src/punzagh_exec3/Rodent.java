package punzagh_exec3;

public class Rodent {

	public static void main(String[] args) {
	
	Rodent r[] = new Rodent[3];
	r[0] = new Mouse();
	r[1] = new Gerbil();
	r[2] = new Hamster();
	for(int i = 0;i<3;i++) {
	r[i].walk();r[i].eat();
	}
	}
	
	public void walk() {
		System.out.println("Rodent is walking");
	}
	public void eat() {
		System.out.println("Rodent is eating");
	}

}
