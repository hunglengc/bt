package lap05;

import java.util.ArrayList;
import java.util.Scanner;

public class b01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> number = new ArrayList<Double>();
		while (true) {
			System.out.print("nhập số thực bất kỳ ");
			Double input = scanner.nextDouble();
			number.add(input);
			scanner.nextLine();
			System.out.println("continue? or Y or N???");

			String opption = scanner.nextLine();
			if (opption.equals("N") || opption.equals("n")) {
				break;
			}
		}
		System.out.println("array: " + number);
		double sum = 0;
		for (int i = 0; i < number.size(); i++) {
			sum += number.get(i);
		}
		System.out.println("sum array= " + sum);
	}
}
