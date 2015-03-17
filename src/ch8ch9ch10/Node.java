package ch8ch9ch10;

// That is ListNode.

public class Node {
	
	String data;
	Node link;
	
	public Node (String Data,Node Link)
	{
		data = Data;
		link = Link;
	}
	
	public Node ()
	{
		data = null;
		link = null;
	}
	
	public String getData()
	{
		return data;
	}

}

// 2013.15.1