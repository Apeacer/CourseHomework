package ch1ch2ch3;
//That is PP2.9
// Time is import!

import java.util.Scanner;

public class PP209 {
	public static void main(String[] arg) {
		int s1, m1, h1, s2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter second : ");

		s1 = scan.nextInt();

		h1 = (int) s1 / 60 / 60;

		m1 = (int) (s1 % 3600) / 60;

		s2 = (s1 % 3600) % 60;

		System.out.println("Time is : " + h1 + "'" + m1 + "\"" + s2 + "'''");

		// 2012.27.10

	}
}
