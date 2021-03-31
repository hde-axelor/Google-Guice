package googleGuice.type2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new CalculatorModule());
		
		Calculator calculator = injector.getInstance(Calculator.class);
		
		System.out.println(calculator);
		
		System.out.println("Addition : "  +calculator.addition(100, 50));
		System.out.println("Subtraction : " +calculator.subtraction(40, 70));
		System.out.println("Multiplication : " +calculator.multiplication(15 , 40));
		System.out.println("Division : " +calculator.division(1300 , 40));		
	}
	
}
