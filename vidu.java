package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vidu {
	public static void main(String[] args) {
		System.out.println("run vidu");
		Pattern pattern = Pattern.compile("^[0-9A-Za-z]+@[0-9A-za-z]+\\.[A-za-z]{2,4}$");
		Matcher matcher = pattern.matcher("hocjava@edu.com");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
