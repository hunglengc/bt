package baidau;

import java.util.Scanner;

public class bài03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh: ");
		int canh = scanner.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("The tich: " + thetich);
		scanner.close();
	}
}
