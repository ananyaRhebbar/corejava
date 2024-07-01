package assignment3;

public class continent {
	
	private String River;
	private String oceans;
	private String deserts;
	private String Mountains;
	public continent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public continent (String River,String oceans, String deserts , String Mountains)
	{

}

	public String getRiver() {
		return River;
	}

	public void setRiver(String river) {
		River = river;
	}

	@Override
	public String toString() {
		return "continent [River=" + River + ", oceans=" + oceans + ", deserts=" + deserts + ", Mountains=" + Mountains
				+ "]";
	}

	public String getOceans() {
		return oceans;
	}

	public void setOceans(String oceans) {
		this.oceans = oceans;
	}

	public String getDeserts() {
		return deserts;
	}

	public void setDeserts(String deserts) {
		this.deserts = deserts;
	}

	public String getMountains() {
		return Mountains;
	}

	public void setMountains(String mountains) {
		Mountains = mountains;
	}
}
