
public class UserProfile {
	private String FName;
	private String LName;
	private String password;
	private float expences[];
	private float revenue[];
	
	public UserProfile(String FName,String LName,String password, float expences[],float revenue[]) {
		this.FName = FName;
		this.LName = LName;
		this.password = password;
		this.expences = expences;
		this.revenue = revenue;
		
	}
	public UserProfile(String FName,String LName,String password) {
		this.FName = FName;
		this.LName = LName;
		this.password = password;
	}
	public String getFName() {return FName;}
	public String getLName() {return LName;}
	public String getPassword() {return password;}
	public float[] getExpences() {return expences;}
	public float[] getRevenue() {return revenue;}
	
}
