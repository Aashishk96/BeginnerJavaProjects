package p2;
	//5 mar	127/550
import java.util.Scanner;
import p1.*;
public class EmployeeMainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter eId:");
		String eId=sc.nextLine();
		System.out.println("Enter eName:");
		String eN=sc.nextLine();
		System.out.println("Enter eDesg:");
		String eD=sc.nextLine();
		
		EmployeeData ed=new EmployeeData(eId,eN,eD);
		
		System.out.println("Enter the EmpHNo:");
		String hNo = sc.nextLine();
		System.out.println("Enter the SName:");
		String sName= sc.nextLine();
		System.out.println("Enter the City:");
		String city = sc.nextLine();
		System.out.println("Enter the PinCode:");
		int pinCode = Integer.parseInt(sc.nextLine());
		
		//Read in the form of String and convert in to int
		 EmployeeAddress ea = new EmployeeAddress(hNo,sName,city,pinCode);
		 
		 System.out.println("Enter the MailId:");
		 String mailId = sc.nextLine();
		 System.out.println("Enter the PhoneNo:");
		 long phoneNo = sc.nextLong();
		 EmployeeContact ec = new EmployeeContact(mailId,phoneNo); 
		 
		 System.out.println("Enter the BSal:");
		 int bS = sc.nextInt();
		 EmployeeSalary es = new EmployeeSalary(bS);
		 
		 ed.getEmployeeData();
		 ea.getEmployeeAddress();
		 ec.getEmployeeContact();
		 es.calculateDisplay();
		 
		 sc.close();
	}
}
