import java.util.Stack;


public class SuperStack<T>
{
	Stack<T> myStack = new Stack<T>();
	
	public SuperStack()
	{		
	}
	
	public void push(T item)
	{
		myStack.push(item);
	}
	
	public void push(Stack<T> stack)
	{
		int depth = stack.size();

		for (int s = depth-1; s >= 0; s--)
		{
			myStack.push(stack.get(s));
		}
	}
	
	public void push(SuperStack<T> sstack)
	{
		push(sstack.myStack);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for (int i = myStack.size()-1; i >= 0; i--)
		{
			if (i != myStack.size()-1)
				sb.append(" ");
			sb.append(myStack.get(i));
		}
		
		sb.append(">");
		return sb.toString();
	}
}
