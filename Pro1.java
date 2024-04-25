package lap04;

public class Pro1 {
	public static void main(String[] args) {
		Product text = new Product();
		Product pro1 = text.nhapThongtin("computer", 100d, 0.1d);
		text.xuatThongtin(pro1);
		System.out.println("tax= " + text.getTaxPrice(pro1.getPrice(), pro1.getTax()));
	}
}
