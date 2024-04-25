package lap07;

public class SinhVienCoKhi extends Sinhvien {
	private double scoreCNC;
	private double socrePLC;

	public SinhVienCoKhi(double scoreCNC, double scorePLC, String name, String id) {
		super(name, id);
		this.scoreCNC = scoreCNC;
		this.socrePLC = scorePLC;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScrePLC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return getScorePLC();
	}

	public void setScorePLC(double scorePLC) {
		this.socrePLC = scorePLC;
	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return (this.scoreCNC + this.socrePLC) / 2;
	}
}
