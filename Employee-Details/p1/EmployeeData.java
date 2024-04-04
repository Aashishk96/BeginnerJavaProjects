package p1;

public class EmployeeData {
	public String eId,eName,eDesg;
	public EmployeeData(String a,String b,String c){
		eId=a;
		eName=b;
		eDesg=c;
	}
	public void getEmployeeData() {
		System.out.println("===EmployeeData===");
		System.out.println("eId is :"+eId);
		System.out.println("eName is :"+eName);
		System.out.println("eDesg is :"+eDesg);
	}
}
