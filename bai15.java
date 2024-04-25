package lap06;

import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		System.out.println("Nhập username");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Nhập password");
		String password = scanner.nextLine();
		System.out.println("username: " + name + " password: " + password);
		if (name.equals("HoidanIt") && password.length() > 6) {
			System.out.println(">>run input");
		}
		scanner.close();
	}
}
