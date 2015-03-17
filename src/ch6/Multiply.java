package ch6;
public class Multiply {

	public static void main(String[] args) {

		for (int a = 1; a <= 12; a++) {
			int b = a;

			for (; b <= 12; b++)
				System.out.print(a + "x" + b + "=" + a * b+ "   \t");
			System.out.println();
		}
	}

}
