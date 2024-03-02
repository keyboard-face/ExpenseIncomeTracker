
public class UserProfile {
//	class variables
	private String FName;
	private String LName;
	private String password;
	private float expenses[];
	private float revenue[];
	
//	constructor for existing expenses and revenues
	public UserProfile(String FName,String LName,String password, float expenses[],float revenue[]) {
		this.FName = FName;
		this.LName = LName;
		this.password = password;
		this.expenses = expenses;
		this.revenue = revenue;
	}
//	constructor for a brand new user
	public UserProfile(String FName,String LName,String password) {
		this.FName = FName;
		this.LName = LName;
		this.password = password;
	}
//	getter functions
	public String getFName() {return FName;}
	public String getLName() {return LName;}
	public String getPassword() {return password;}
	public float[] getExpences() {return expenses;}
	public float[] getRevenue() {return revenue;}
	
//	function to update the first name (FName) of a user
	public void updateFName(String newName) {
		this.FName = newName;
	}
	
//	function to update the last name (LName) of a user
	public void updateLName(String newName) {
		this.LName = newName;
	}
	
//	function to update the password (password) of a user
	public void updatePassword(String newPassword) {
		this.password = newPassword;
	}
	
//	function to update the expenses list (expenses[]) with a updated list
	public void updateExpences(float[] newExpenses) {
		this.expenses = newExpenses;
	}
	
//	function to update the revenue list (revenue[]) with a updated list
	public void updateRevenue(float[] newRevenue) {
		this.revenue =  newRevenue;
	}
}
