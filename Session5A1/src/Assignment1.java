
public class Assignment1 {
	/*
	 * Defining an interface and its implementation in two different classes in
	 * different way. Define an interface having one method that takes an
	 * integer parameter. For this method, provide two implementations: In the
	 * first one, just print the value and in the second one, print the square
	 * of the number. Try to call both the versions
	 */
	public static void main(String[] args) {

		FirstClass first = new FirstClass();
		SecondClass second = new SecondClass();
		
		first.printOutput(42);
		second.printOutput(42);
	}

}

interface MathInterface {
	public void printOutput(int x);
}

class FirstClass implements MathInterface {
	@Override
	public void printOutput(int x) {
		System.out.println(x);
	}
}

class SecondClass implements MathInterface {
	@Override
	public void printOutput(int x) {
		System.out.println(x * x);
	}

}
