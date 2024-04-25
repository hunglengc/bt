package lap07;

public class SinhVienIT extends Sinhvien {
	private double scorejava;
	private double scoreHTML;

	public SinhVienIT(double scorejava, double scoreHTML, String name, String id) {
		super(name, id);
		this.scorejava = scorejava;
		this.scoreHTML = scoreHTML;
	}

	public double getSocrejava() {
		return scorejava;
	}

	public void setSocrejava(double socrejava) {
		this.scorejava = scorejava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return (this.scorejava * 2 + this.scoreHTML) / 3;
	}
}
