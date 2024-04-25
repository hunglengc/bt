package lap07;

public class bailm {
	public static void main(String[] args) {
		System.out.println("run bailm");
		SinhVienIT st1 = new SinhVienIT(10, 9, "Hung", "123");
		System.out.println("sinh vien it score= " + st1.getScore());
		SinhVienCoKhi st2 = new SinhVienCoKhi(8, 8.5, "Hung", "123");
		System.out.println("sinh vien co khi score= " + st2.getScore());
	}
}
