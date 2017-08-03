package Dog;

public class DogClass {
	public DogClass() {
		
	}
	
	public void bark(String action)
	{
		System.out.println("the Dog " + action);
	}
	public void bark(String action, String anyWord) {
		System.out.println("the Dog " + action + anyWord);
	}
	public void bark(int num)	{
		System.out.println(num + "# of dog/dogs");
	}
}
