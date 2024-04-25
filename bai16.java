package lap06;

public class student {
	private String name;
	private String id;

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}

	public student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public String getid() {
		return id;
	}

	public void setid() {
		this.id = id;
	}
}
