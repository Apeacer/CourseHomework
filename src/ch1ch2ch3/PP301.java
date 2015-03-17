package ch1ch2ch3;

// That is PP3.1

import java.util.Random;

import java.util.Scanner;


public class PP301
{

	public static void main (String[] arg)
	
	{
		String s1,s2 ;
		
		int a1 ;
		
		Scanner scan = new Scanner (System.in) ;
	
		System.out.println  ("Enter your first name : ") ;
		
		s1 = scan.nextLine() ;
		
		System.out.println ("Enter your last name : ") ;
		
		s2 = scan.nextLine() ;
	
		Random generator = new Random();
		
		a1 = generator.nextInt(90)+10 ;
		
		System.out.println ( "Your ID is : " + s1.substring(0,1) + 
				              s2.substring(0,5) + a1 ) ;		
		
		// 2012.26.10-2012.27.10
	}

}
