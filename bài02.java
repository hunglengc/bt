package baidau;

import java.util.Scanner;

public class bài02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai: ");
		int Dai = scanner.nextInt();
		System.out.println("Chieu rong: ");
		int Rong = scanner.nextInt();

		System.out.println("Chu vi: " + (Dai + Rong) * 2);
		System.out.println("Dien tich: " + (Dai * Rong));
		System.out.println("Min: " + Math.min(Dai, Rong));
		scanner.close();
	}
}
