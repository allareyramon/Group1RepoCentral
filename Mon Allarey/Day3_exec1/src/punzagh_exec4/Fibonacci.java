package punzagh_exec4;

public class Fibonacci {

	public static void main(String[] args) {
		
		int x = 1;
		int prev = 0;
		int sum= 0;
		int ctr = 1;
		String Fibonacci = x +", ";
		if(x==1) {

		while(ctr<100) {
			sum = x+prev;
			Fibonacci = Fibonacci + sum +", ";
			prev = x;
			x= sum;
			ctr++;
		}
		System.out.println(Fibonacci.substring(0, Fibonacci.length()-2));
		}
	}

}
