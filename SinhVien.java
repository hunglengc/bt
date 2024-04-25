package lap07;

public abstract class Sinhvien {
	abstract double getScore();

	protected String name;
	protected String id;

	public Sinhvien(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
