package calculate;



class Stack {
	
	private class Node
	{
		double value;
		Node next;
		Node(double val, Node n)
		{
			value = val;
			next = n;
		}
	}
	private Node top = null;
	
	public boolean empty()
	{
		return top == null;
	}
	
	public void push(double s)
	{
		top = new Node(s, top);
	}
	
	public double pop()
	{
		double retValue = top.value;
		top = top.next;
		return retValue;
	}

}
