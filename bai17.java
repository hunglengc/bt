package lap09;

import java.util.Scanner;

public class blm {
	public static int nhapMasv() {
		int result;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("nhập mã sv");
			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("mã sv không hợp lệ. nhập vào số nguyên");
				scanner.next();
			}
		}
		scanner.close();
		return result;
	}

	public static void main(String[] args) {
		System.out.println("");
		try (Scanner scanner = new Scanner(System.in)) {
			int masv = nhapMasv();

			SinhVien sv = new SinhVien(masv, "Hung", 6.5, 21);
			System.out.println("sinh viên " + sv);
		}
	}
}
