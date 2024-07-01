package assignment3;

public class state {
	private String city;
	private String capital;
	private String place;
	private String sname;
	public state(String city, String capital, String place, String sname) {
		super();
		this.city = city;
		this.capital = capital;
		this.place = place;
		this.sname = sname;
	}
	public state() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "state [city=" + city + ", capital=" + capital + ", place=" + place + ", sname=" + sname + ", getCity()="
				+ getCity() + ", getCapital()=" + getCapital() + ", getPlace()=" + getPlace() + ", getSname()="
				+ getSname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
	