package baidau;

import java.util.Scanner;

public class bai07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		int điện = scanner.nextInt();

		if (điện <= 100) {
			int tiền = điện * 1000;
			System.out.println("Tiền điện là: " + tiền);
		} else {
			int tiền = 100 * 1000 + (điện - 100) * 1500;
			System.out.println("Tiền điện là: " + tiền);
		}
	}
}
