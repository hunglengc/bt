package baidau;

import java.util.Scanner;

public class bài06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập biến a");
		int a = scanner.nextInt();
		System.out.println("nhập biến b");
		int b = scanner.nextInt();
		System.out.println("nhập biến c");
		int c = scanner.nextInt();

		if (a == 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			int del = b * b - 4 * a * c;
			if (del < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (del == 0) {
				int x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép: " + x);
			} else {
				double x1 = (-b + Math.sqrt(del)) / (2 * a);
				double x2 = (-b - Math.sqrt(del)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm x1,x2: " + x1 + x2);
			}
		}
	}
}
