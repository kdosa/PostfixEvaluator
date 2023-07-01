package calculate;

class Queue
{
	private class Node
	{
		String value;
		Node next;
		Node(String val, Node n)
		{
			value = val;
			next = n;
		}
	}
	private Node front = null;
	private Node rear = null;
	
public boolean empty()
{
	return front == null;
}
	
public void enqueue(String s)
{
	if(rear != null)
	{
		rear.next = new Node(s, null);
		rear = rear.next;
	}
	else
	{
		rear = new Node(s, null);
		front = rear;
	}
}

public String dequeue()
{
	String value = front.value;
	front = front.next;
	if(front == null)
	{
		rear = null;
	}
	return value;
 }
}
