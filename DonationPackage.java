public class DonationPackage {
	private String description;
	private int weight;
	
	public DonationPackage(String d, int w) {
		this.description=d;
		this.weight=w;
	}
	
	public DonationPackage() {
		description="none";
		weight=0;
	}
	
	public String getDescription() {
		return description;
	}

}