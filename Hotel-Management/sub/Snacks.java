package sub;

import java.util.Scanner;

public class Snacks extends Billing {
	public float snacks(Scanner s) {
		while (true) {
			System.out.println("Please select option for breakfast ==>");
			System.out.println("1.Samosa \n2.Kachori \n3.Vadapav \n4.Sandwich \n5.Maggie");
			int ch = Integer.parseInt(s.nextLine());
			switch (ch) {
			case 1:
				System.out.println("Enter number of qauntity");
				int bf1 = Integer.parseInt(s.nextLine());
				bill = bill + bf1 * 15;
				break;
			case 2:
				System.out.println("Enter number of qauntity");
				int bf2 = Integer.parseInt(s.nextLine());
				bill = bill + bf2 * 15;
				break;
			case 3:
				System.out.println("Enter number of qauntity");
				int bf3 = Integer.parseInt(s.nextLine());
				bill = bill + bf3 * 20;
				break;
			case 4:
				System.out.println("Enter number of qauntity");
				int bf4 = Integer.parseInt(s.nextLine());
				bill = bill + bf4 * 50;
				break;
			case 5:
				System.out.println("Enter number of qauntity");
				int bf5 = Integer.parseInt(s.nextLine());
				bill = bill + bf5 * 30;
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want anything else from breakfast");
			System.out.println("Press Y for Yes OR N for No");
			String ch1 = s.nextLine();
			if (ch1.equalsIgnoreCase("n")) {
				break;
			}
		}
		return bill;
	}

}
