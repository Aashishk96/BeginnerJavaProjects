package p1;

public class EmployeeAddress {
	public String hNo,sName,city;
	public int pinCode;
	public EmployeeAddress(String a,String b,String c,int d){
		hNo=a;
		sName=b;
		city=c;
		pinCode=d;
	}
	public void getEmployeeAddress() {
		System.out.println("===EmployeeAddress===");
		System.out.println("hNo is :"+hNo);
		System.out.println("sName is :"+sName);
		System.out.println("city is :"+city);
		System.out.println("pincode is :"+pinCode);
	}
}
