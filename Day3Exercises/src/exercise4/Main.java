package exercise4;

public class Main {

	public static void main(String Args[]) {

		fib(0, 1);

	}

	static void fib(int x, int y) {

		if (y > 100) {
			return;
		}
		System.out.print(y + " ");

		fib(y, y + x);

	}

}
