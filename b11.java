package p1;

public class chay {
	public static void main(String[] args) {
		System.out.println("run chay");
		SinhvienIT st1 = new SinhvienIT("java", "Hung", "173", 20, 0.1);
		System.out.println("st1 check = " + st1.id);
		SinhvienCoKhi st2 = new SinhvienCoKhi("machine", "hung", "173", 20, 0.1);
		System.out.println("st2 check = " + st2.name);
	}
}
