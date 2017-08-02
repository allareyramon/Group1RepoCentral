package Dog;

public class DogClass {
	public DogClass() {
		
	}
	
	public void DogAct(String action)
	{
		System.out.println("the Dog " + action);
	}
	public void DogAct(String action, String anyWord) {
		System.out.println("the Dog " + action + anyWord);
	}
	public void DogAct(int num)	{
		System.out.println(num + "# of dog/dogs");
	}
}
