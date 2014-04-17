package deployment;

public class MpmKennzahl implements Comparable<MpmKennzahl> {

	private int est;
	private int eft;
	private int dauer;

	public MpmKennzahl(int est, int eft, int dauer) {
		this.est = est;
		this.eft = eft;
		this.dauer = dauer;
	}

	public int getEst() {
		return est;
	}

	public void setEst(int est) {
		this.est = est;
	}

	public int getEft() {
		return eft;
	}

	public void setEft(int eft) {
		this.eft = eft;
	}

	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

	public int compareTo(MpmKennzahl o) {
		return o.getEst() - this.getEst();
	}
}
