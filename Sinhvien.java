package p1;

public class Sinhvien {
	protected String name;
	protected String id;
	protected double price;
	protected double tax;

	public Sinhvien(String name, String id, double price, double tax) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("run with parent");
	}
}
