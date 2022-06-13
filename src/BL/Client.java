package BL;

import java.util.ArrayList;

public class Client {

	String name;
	String CNIC;
	String email;
	int age;
	String contactNumber;
	
	public ArrayList<Reservation> clientReservations;

	public Client(String Name, String cnic, int Age, String contactNo, String Email){
		
		this.name = Name;
		this.CNIC = cnic;
		this.email = Email;
		this.age = Age;
		this.contactNumber = contactNo;
		
		clientReservations = new ArrayList<Reservation>();
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCNIC() {
		return CNIC;
	}
	public void setCNIC(String cNIC) {
		CNIC = cNIC;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
