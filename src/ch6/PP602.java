package ch6;
// That is PP6.2

import java.util.*;

public class PP602 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a sentence : ");

		String str = input.nextLine();
		char s;

		int a = str.length(), b = 0;

		for (; b < a; b++) {

			s = str.charAt(b);

			System.out.println(s);
		}
	}

}
