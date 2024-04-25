package lap02;

import java.util.Arrays;
import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số phần tử ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("nhập phần tử ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Array ban đầu" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array sắp xếp" + Arrays.toString(a));
		System.out.println("Max= " + a[a.length - 1]);
		System.out.println("min= " + a[0]);
	}
}
