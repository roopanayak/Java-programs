package MyProject;

public class Employee {
	 
	 private String Emp_name;
	 private int id;
	 private String address;
	 private int Phone_no;
	 private String Email_id;
	 public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_no() {
		return (int) Phone_no;
	}
	public void setPhone_no(int phone_no) {
		Phone_no = phone_no;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	 public static void main(String args[]){
	 
	Employee obj = new Employee();
	 
	 obj.setEmp_name("Roopa");
	 obj.setId(1);
	 obj.setAddress("Bangalore");
	 obj.setPhone_no(7864512);
	 obj.setEmail_id("naik123@gmail.com");
	 System.out.println(obj.getEmp_name());
	 System.out.println(obj.getId());
	 System.out.println(obj.getAddress());
	 System.out.println(obj.getPhone_no());
	 System.out.println(obj.getEmail_id());
	}


	}