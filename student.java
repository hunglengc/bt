package lap04;

public class student {
	private String name;
	private double price;
	private double tax;

	public student() {
	}

	public student(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public student nhapThongtin(String name, double price, double tax) {
		student st1 = new student(name, price, tax);
		return st1;
	}

	public void xuatThongtin(student st2) {
		System.out.println("name= " + st2.getName() + "price= " + st2.getPrice() + "tax= " + st2.getTax());
	}

	public double getTaxPrice(double Price, double tax) {
		return price * tax;
	}
}
