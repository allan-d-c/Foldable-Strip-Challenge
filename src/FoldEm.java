import java.util.ArrayList;
import java.util.List;


public class FoldEm 
{
	public static List<SuperStack<Integer>> fold(String actions, List<Integer> paper) throws Exception 
	{
		int power = actions.length();
		if (paper.size() != Math.pow(2,power)) 
			throw new IllegalArgumentException();
		
		List<SuperStack<Integer>> results = new ArrayList<SuperStack<Integer>>();
		for (int i = 0; i< paper.size(); i++)
		{
			SuperStack<Integer> ss = new SuperStack<Integer>();
			ss.push(paper.get(i));
			results.add(ss);
		}
		
		for (Character action : actions.toCharArray())
		{
			List<SuperStack<Integer>> left = results;
			List<SuperStack<Integer>> right = split(results);
			
			if (action == 'L')
			{
				reverse(right);

				for (int i = 0; i< left.size(); i++)
				{
					left.get(i).push(right.get(i));
				}
				
				results = left;
			}			
			else if (action == 'R')
			{
				reverse(left);

				for (int i = 0; i< right.size(); i++)
				{
					right.get(i).push(left.get(i));
				}
				
				results = right;
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		
		return results;
	}

	private static <U> void reverse(List<U> list)
	{
		for (int i = 0; i< list.size()/2; i++)
		{
			int from = i;
			int to = list.size()-1-i;
			
			U a = list.get(from);
			U b = list.get(to);
			list.set(from, b);
			list.set(to, a);
		}
	}

	private static <U> List<U> split(List<U> results) throws Exception
	{
		List<U> newbie = (List<U>)results.getClass().newInstance();
		
		for (int i = results.size()/2; i< results.size(); i++)
		{
			newbie.add(results.get(i));
		}
		
		int howManyToRemove = results.size()/2;
		
		for (int i = 0; i< howManyToRemove; i++)
		{
			results.remove(results.size()-1);
		}
		
		return newbie;
	}
}
