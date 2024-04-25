package baidau;

import java.util.Scanner;

public class bài01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten Sinh vien: ");
		String ten = scanner.nextLine();
		System.out.println("Diem trung binh: ");
		int Diem = scanner.nextInt();
		System.out.println("tensinhvien: " + ten + ", diemtrungbinh: " + Diem);
		scanner.close();
	}
}
