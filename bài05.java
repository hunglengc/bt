package baidau;

import java.util.Scanner;

public class bài05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập biến a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập biến b: ");
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = -b / a;
			System.out.println("phương trình có nghiệm =" + x);
		}
	}
}
