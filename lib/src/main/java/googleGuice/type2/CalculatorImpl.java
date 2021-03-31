package googleGuice.type2;

import com.google.inject.Singleton;

@Singleton
public class CalculatorImpl implements Calculator {


	public int addition(int a, int b) {
		return a + b;
	}

	
	public int subtraction(int a, int b) {
		return a - b;
		
	}

	public int multiplication(int a, int b) {
		return a * b;

	}

	
	public int division(int a, int b) {
		return a / b;

	}

}
