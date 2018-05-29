package lab1;
 

public class Developer extends EmployeeRecord {
	private String role;

	public Developer() {
		super();
		this.role = "Developer"; 
	}
	
	public Developer(String role) {
		super();
		this.role = role; 
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
