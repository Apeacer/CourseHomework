package ch7;
// That is PP7.2



public class Student {
	
	private double g1=0, g2=0, g3=0, a1,g;
	private String n;
	
	public double setTestScore (String name, int num, double Score){
		
		n=name;
		
		a1=num;
		
		if (a1==1)
			g1=Score;
		
		if (a1==2)
			g2=Score;
		
		if (a1==3)
			g3=Score;
		
		if(a1!=1&&a1!=2&&a1!=3)
			System.out.println("Student shouldn't have so many test !");
		
		return Score;	
	}
	
	public double getTestScore(int num){
		
		a1=num;
		
		if (a1==1)
			System.out.println("The frist score is :"+g1);
		
		if (a1==2)
			System.out.println("The second score is :"+g2);
		
		if (a1==3)
			System.out.println("The third score is :"+g3);
		
		if(a1!=1&&a1!=2&&a1!=3)
			System.out.println("Student shouldn't have so many test !");
		
		return num;
		
	}
	public double Average()
	{
		return  g = (g1+g2+g3)/3;
	}
	public String toString()
	{
		return n+"\n\tfirst Score is "+g1+"\n\tsecond score is "+g2+
				            "\n\tthird score is "+g3+"\n\taveragr score is "+g;
		
	}

}
