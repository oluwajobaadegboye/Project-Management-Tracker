package lab1;

public class ProjectManager extends EmployeeRecord{
	private String role;
	
	public ProjectManager() {
		super();
		this.role = "Developer"; 
	}
	
	public ProjectManager(String role) {
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
 