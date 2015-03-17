package ch8ch9ch10;

// That is Dynamic list. 

public class List {
	
	Node position;	
	private Node head = new Node();

//Add Node--------------------------------------------------------------------------------------
	public void addNode(int index , String data1)
	{
		if (head == null)
		{
			head = new Node (data1,null);
		}
		else
		{
			Node position = head;
			
			for (int po=0;po<index;po++)
			{
				position = position.link;
			}
		}
	}
//Delete Node--------------------------------------------------------------------------------------
	public void deleteNode(int index)
	{
		Node position =head;
		int po=0;
		
		if(head!=null)
		{
			if(index==0)
			{
				position=position.link;
			}
			else
			{
				while(position!=null&&po<index)
				{
					position=position.link;
					po++;
				}
				if(index<=po)
					position.link=position.link.link;
				else
					System.out.println("Out of range!");
			}		
		}
		else
			System.out.println("That is empty list.");
	}
//Count Node--------------------------------------------------------------------------------------
	public int countNode()
	{		
		position =head;
		
		if(head==null)
		{
			return 0;
		}
		else
		{
			int result=0;
			
			while(position!=null)
			{
				position=position.link;
				result++;
			}
			
			return result;
		}
	}
//Find Node--------------------------------------------------------------------------------------
	public int[] findNode(String data2)
	{
		int result []=new int[countNode()];
		int index=0,po=0;
		position=head;
		
		while(position!=null)
		{
			if(position.getData().equals(data2))
			{
				result[po]=index;
				po++;
			}
			position=position.link;
			index++;
		}
		return result;
	}
//--------------------------------------------------------------------------------------
// 2012.15.1-2012.16.1
}
