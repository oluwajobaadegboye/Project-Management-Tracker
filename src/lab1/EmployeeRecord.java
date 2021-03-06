package lab1;

import java.util.Date;

public class EmployeeRecord {
	private String firstName;
	private String lastName;
	private String ssn;
	private Date birthDate;
	
	
	public EmployeeRecord() {
		super();
	}
	public EmployeeRecord(String firstName, String lastName, String ssn, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.birthDate = birthDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
