
public class UserProfile {
	private String FName;
	private String LName;
	private float expences[];
	private float revenue[];
	
	public UserProfile(String FName,String LName,float expences[],float revenue[]) {
		this.FName = FName;
		this.LName = LName;
		this.expences = expences;
		this.revenue = revenue;
	}
	public UserProfile(String FName,String LName) {
		this.FName = FName;
		this.LName = LName;
	}
	public String getFName() {return FName;}
	public String getLName() {return LName;}
	public float[] getExpences() {return expences;}
	public float[] getRevenue() {return revenue;}
	
}
