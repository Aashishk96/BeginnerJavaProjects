package main;

import java.util.Scanner;

import sub.Billing;
import sub.BreakFast;
import sub.Drinks;
import sub.Snacks;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("=== Welcome to Your-wish Hotel ===");
		System.out.println("=== we are ready to serve you ===");
		float totBill = 0;
		BreakFast bf = new BreakFast();
		Snacks sn = new Snacks();
		Drinks dn = new Drinks();
		Billing bl = new Billing();

		while (true) {
			System.out.println("please select your option =>>");
			System.out.println("1.BreakFast \n2.Snacks \n3.Drinks");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				totBill += bf.breakFast(sc);
				break;
			case 2:
				totBill += sn.snacks(sc);
				break;
			case 3:
				totBill += dn.drinks(sc);
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Do you want anything else to eat");
			System.out.println("Press Y for Yes OR N for No");
			String ch = sc.nextLine();
			if (ch.equalsIgnoreCase("n")) {
				break;
			}
		}
		bl.getBill(totBill);
	}
}
