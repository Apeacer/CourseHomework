package ch6;
// That is PP6.1

import java.util.*;

public class PP601 {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the random :");
		
		int a1 =scan.nextInt(),a2;
		
		if(a1>=2){
		
		if(a1%2==0)
			a2 = a1/2+a1*a1/4;
		else
			a2 = (a1-1)/2+(a1-1)*(a1-1)/4+a1;
		
		System.out.println("result is : "+a2);
		
		}
		else
			System.out.println("Error!");
		
		
	}
	

}
