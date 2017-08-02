package Fibonacci;

public class FibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0; //first number
		int y = 1; //second number
		int next = 0; //temp holder
		//for(int z =0 ; z<100; z++) //allows fibonacci upto 100th series 
		for(; x <= 100;) // allows fibonacci upto 100 value
		{
			if(x == 0 && y==1)
				System.out.println(x);
			else
				System.out.println(x);
			
			next = x+y;
			y= x;
			x=next;
		}

	}

}
