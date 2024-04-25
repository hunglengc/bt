package lap02;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số nguyên ");
		int x = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d*%d=%d ", x, i, x * i);
			System.out.println("\n");
		}
		scanner.close();
	}
}
