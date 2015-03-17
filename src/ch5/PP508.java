package ch5;

import java.util.*;
public class PP508 {

	public static void main (String[] args) {
		
		int a1,a2,a3;
		String str="y";
		
		Random num = new Random();

		while(str.equalsIgnoreCase("y")){
		a1=num.nextInt(10);
		a2=num.nextInt(10);
		a3=num.nextInt(10);
		
		System.out.println(a1+"  "+a2+"  "+a3);
		if((a1==a2)||(a2==a3)||(a1==a3))
		{
			if(a1==a2&&a2==a3)
				System.out.println("Yery good !");
			else
				System.out.println("Well done !");
		}
		else
			System.out.println("Try next ?(y/n)");
		
		Scanner input =new Scanner(System.in);
		str=input.nextLine();
	}
	
  }
}
