package homeTask7;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if (((a + b) > c) && ((a + c) > b) && ((c + b) > a))
			System.out.println("Triangle exist!");
		else
			System.out.println("Triangle does not exist!");
		input.close();

	}

}
