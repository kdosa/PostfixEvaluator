package calculate;

public class Main {

	public static void main(String [] arg)
	{
		Evaluator calc = new Evaluator();
		double result;
		
		System.out.println(calc.about());
		
		// Following are the postfix expression I have used to calculate 
		
		result = calc.evaluate("5 22 90 * +");  
		
		//more expressions to test
		// result = calc.evaluate("10.2 56 - 2.9 *");
		// result = calc.evaluate("5 7 11 68 - % +");
		// result = calc.evaluate("10 30 2 * ^");
		// result = calc.evaluate("9 2 5 ^ %");
		  
		System.out.println(result);
	}
}
