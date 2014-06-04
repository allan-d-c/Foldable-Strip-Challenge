import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class FoldEmTest 
{
	@Test
	public void happyPath() throws Exception
	{
		List<Integer> paper = new ArrayList<Integer>();
		paper.add(1);
		paper.add(2);
		paper.add(3);
		paper.add(4);
		
		List<SuperStack<Integer>> results = FoldEm.fold("LL", paper);
		assertEquals("[<2 3 4 1>]", results.toString());		
	}
	
	@Test
	public void happyPath2() throws Exception
	{
		List<Integer> paper = new ArrayList<Integer>();
		paper.add(1);
		paper.add(2);
		paper.add(3);
		paper.add(4);
		
		List<SuperStack<Integer>> results = FoldEm.fold("RR", paper);
		assertEquals("[<3 2 1 4>]", results.toString());		
	}
	
	@Test
	public void happyPath3() throws Exception
	{
		List<Integer> paper = new ArrayList<Integer>();
		paper.add(1);
		paper.add(2);
		paper.add(3);
		paper.add(4);
		
		List<SuperStack<Integer>> results = FoldEm.fold("RL", paper);
		assertEquals("[<4 1 2 3>]", results.toString());		
	}	
}
