package calculate;

import java.util.StringTokenizer;

public class Evaluator {

	double result;
	Queue q = new Queue();
	Stack s = new Stack();


public String about()
{
	return "Postfix Evaluator";
}

public boolean isOperator(String o)
{
 
	if (o.equals("+") || o.equals("-") || o.equals("*") || o.equals("%") || o.equals("-") || o.equals("^"))
		return true;
	else
		return false;
}


public void calculate(String o)
{
	//double result = 0;
	double operand2 = s.pop();
	double operand1 = s.pop();
	
	switch (o)
	{
		case "^":
			result = Math.pow(operand1,operand2);
			break;

		case "*":
			result = operand1 * operand2;
			break;

		case "/":
			result = operand1 / operand2;
			break;

		case "+":
			result = operand1 + operand2;
			break;

		case "-":
			result = operand1 - operand2;
			break;

		case "%":
			result = operand1 % operand2;
			break;
	}
	s.push(result);
}

		
public double evaluate(String text)
{
	StringTokenizer st = new StringTokenizer(text, " ");
	while(st.hasMoreTokens())		
	{			
		q.enqueue(st.nextToken());
	}

	while (!q.empty())
	{
			
		String val = q.dequeue();

		if (isOperator(val))
		{
			calculate(val);
		}
		else 
		{
			double d = Double.parseDouble(val);
			s.push(d);
		}
	}
	return s.pop();
 }
	
}
