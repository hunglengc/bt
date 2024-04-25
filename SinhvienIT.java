package p1;

public class SinhvienIT extends Sinhvien {
	private String laugage;

	public SinhvienIT(String laugage, String name, String id, double price, double tax) {
		super(name, id, price, tax);
		this.laugage = laugage;
	}

	public String getLaugage() {
		return laugage;
	}

	public void setLaugage(String laugage) {
		this.laugage = laugage;
	}

	public void getMoney() {
		System.out.println("run get Money");
		super.info();
	}
}
