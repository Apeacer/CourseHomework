package ch5;

// that is pp5.1

import java.util.Scanner;

public class PP501 {

	public static void main (String[] agr){
		
		String another;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you want a test ?(y/n) ");
		
		another = scan.nextLine();
		
		while (another.equalsIgnoreCase("y")) 
	{	
		
			int a1 ;
		
		    System.out.println("Enter a year : ");
		
		    a1=scan.nextInt();
		
		    if ((a1%4==0 && a1%100!=0)||(a1%100==0 && a1%400==0))
		    {System.out.println(a1+" is leap year.");}
		
		    else
		    {System.out.println(a1+" isn't leap year.");}
		
		    System.out.println();
		
		    System.out.println("Try again (y/n) ? ");
		
		    another = scan.nextLine();
		    another = scan.nextLine();
		
		}
		
		if (another.equalsIgnoreCase("n"))
		{System.out.println("Thank you ! ");}
		
		else
		{System.out.println("Error!");}
		
	}
			
}

// 2012.7.11

