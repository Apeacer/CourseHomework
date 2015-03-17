package ch8ch9ch10;
// That is pp8.3 form

import java.util.*;

public class PP803 {
	public static void main(String[] agrs) {
		
		int random[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		Scanner input = new Scanner(System.in);

		String str = "y";

		while (str.equalsIgnoreCase("y")) {

			System.out.println("Please enter some count (1-100) :");

			int a = input.nextInt();

			if (a >= 1 && a <= 100)
				random[(int) ((a - 1) / 10)]++;
			else
				System.out.println("Error!");

			Scanner scan = new Scanner(System.in);

			System.out.println("Again?(y/n)");

			str = scan.nextLine();
		}
		for (int b = 0; b < 10; b++) {
			
			System.out.print(b * 10 + 1 + "-" + (b + 1) * 10 + "\t |\t");
			
			for (int c = 0; c < random[b]; c++)

				System.out.print("*");
			
			System.out.println();
		}
	}

}
