package lap02;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số nguyên tố ");
		int value = scanner.nextInt();
// 1 < xxx < value
		int count = 0;
		for (int i = 2; i < value - 1; i++) {
			if (value % i == 0) {
				System.out.println("Ước số khác " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("là số nguyên tố" + value);
		} else {
			System.out.println("không là số nguyên tố" + value);
		}
	}
}
