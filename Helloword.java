package baidau;

import java.util.Scanner;

public class Helloword {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Frist number : ");
		int Fristnumber = scanner.nextInt();
		System.out.println("Second number : ");
		int Secondnumber = scanner.nextInt();
		System.out.println("Min = " + Math.min(Fristnumber, Secondnumber));
		scanner.close();
	}
}
