package googleGuice.type3;

import com.google.inject.Inject;

public class CalculatorService {
	
	@Inject
	private  Calculator calculator;
	
	
	public int Calculator (int a , int b , String op) {
		
		if(op.equalsIgnoreCase("add")) {
			return calculator.addition(a, b);
		}
		else if(op.equalsIgnoreCase("sub")) {
			return calculator.subtraction(a, b);
		}
		else if(op.equalsIgnoreCase("mul")) {
			return calculator.multiplication(a, b);
		}
		else if(op.equalsIgnoreCase("div")) {
			return calculator.division(a, b);
		}
		
		return 0;
	}

}
