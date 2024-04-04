package p1;

public class EmployeeSalary {
	public int bSal;
	public double totSal;
	public EmployeeSalary(int a){
		bSal=a;	
	}
	public void calculateDisplay() {
		totSal=bSal+(bSal*0.69)+(bSal*45);
		System.out.println("===EmployeeSalary===");
		System.out.println("bsal is :"+bSal);
		System.out.println("tot sal is :"+totSal);
	}
}
