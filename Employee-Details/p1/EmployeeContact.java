package p1;

public class EmployeeContact {
	public String mailId;
	public Long phoneNo;
	public EmployeeContact(String a,Long b){
		mailId=a;
		phoneNo=b;
	}
	public void getEmployeeContact() {
		System.out.println("===EmployeeContact===");
		System.out.println("mailId is :"+mailId);
		System.out.println("phoneno is :"+phoneNo);
	}
	
}
