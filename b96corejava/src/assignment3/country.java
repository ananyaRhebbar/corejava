package assignment3;

public class country extends continent{
	
	private String soil;
	private String landform;
	private String hill;{
	}
	public country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public country(String River, String oceans, String deserts, String Mountains) {
		super(River, oceans, deserts, Mountains);
		// TODO Auto-generated constructor stub
	}
	public String getSoil() {
		return soil;
	}
	public void setSoil(String soil) {
		this.soil = soil;
	}
	public String getLandform() {
		return landform;
	}
	public void setLandform(String landform) {
		this.landform = landform;
	}
	public String getHill() {
		return hill;
	}
	public void setHill(String hill) {
		this.hill = hill;
	}
	@Override
	public String toString() {
		return "country [soil=" + soil + ", landform=" + landform + ", hill=" + hill + ", getSoil()=" + getSoil()
				+ ", getLandform()=" + getLandform() + ", getHill()=" + getHill() + ", getRiver()=" + getRiver()
				+ ", toString()=" + super.toString() + ", getOceans()=" + getOceans() + ", getDeserts()=" + getDeserts()
				+ ", getMountains()=" + getMountains() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
