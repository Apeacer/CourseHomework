package ch8ch9ch10;

public class SelectionSort {
	
	
	
	public static void selection (int[] list)
	{
		int a;
		int temp;
		
		for (int indext=1; indext<list.length-1; indext++)
		{
			a=indext;
			for (int scan=indext+1; scan < list.length; scan++)
			{
				if (list[scan]-(list[a])<0)
					a=scan;
				temp=list[a];
				list[a]=list[indext];
				list[indext]=temp;
			}
		}
	}
	
	public static void InsertionSort (int [] list)
	{
		for (int indext=1;indext<list.length-1; indext++)
		{
			int key = list[indext];
			int b=indext;
			
			while (b>0&&key-list[b-1]<0)
			{
				list[b]=list[b-1];
				b--;
			}
			list[b]=key;
		}
	}

}
