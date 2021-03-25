package googleGuice.type3;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class CalculatorMain {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new CalculatorModule());
		CalculatorService calculatorService = injector.getInstance(CalculatorService.class);
		Calculator calculator = injector.getInstance(Calculator.class);
		
		System.out.println(calculator);
		
		System.out.println("Addition : "  +calculatorService.Calculator(1000, 50 , "add"));
		System.out.println("Subtraction : " +calculatorService.Calculator(340, 70 , "sub"));
		System.out.println("Multiplication : " +calculatorService.Calculator(135 , 40 , "mul"));
		System.out.println("Division : " +calculatorService.Calculator(1300 , 403, "div"));
		
		System.out.println(calculator);


	}
	
}
