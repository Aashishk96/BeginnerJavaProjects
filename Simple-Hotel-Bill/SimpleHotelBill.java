package main;

import java.util.Scanner;

public class SimpleHotelBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== Welcome to xyz Hotel ====");
		System.out.println("=== We are here to serve you ===");
		System.out.println("Please choose your food category:\n 1.BreakFast \n 2.Snacks \n 3.Drinks");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("We have different options for BreakFast choose anything");
			System.out.println(
					"\n 1.Idli - Rs30 \n 2.Dosa - Rs50 \n 3.MeduVada - Rs40 \n 4.Misal - Rs80 \n 5.Poha - Rs15");
			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				System.out.println("Enter no. of qty");
				int bf1 = sc.nextInt();
				int bl1 = bf1 * 30;
				System.out.println("Your bill is :-Rs " + bl1);
				break;
			case 2:
				System.out.println("Enter no. of qty");
				int bf2 = sc.nextInt();
				int bl2 = bf2 * 50;
				System.out.println("Your bill is :-Rs " + bl2);
				break;
			case 3:
				System.out.println("Enter no. of qty");
				int bf3 = sc.nextInt();
				int bl3 = bf3 * 40;
				System.out.println("Your bill is :-Rs " + bl3);
				break;
			case 4:
				System.out.println("Enter no. of qty");
				int bf4 = sc.nextInt();
				int bl4 = bf4 * 80;
				System.out.println("Your bill is :-Rs " + bl4);
				break;
			case 5:
				System.out.println("Enter no. of qty");
				int bf5 = sc.nextInt();
				int bl5 = bf5 * 15;
				System.out.println("Your bill is :-Rs " + bl5);
				break;
			default:
				System.out.println("Invalid choice");
			}
			break;

		case 2:
			System.out.println("We have different options for Snacks choose anything");
			System.out.println(
					"\n 1.VadaPav - Rs20 \n 2.Bhaje - Rs30 \n 3.Hot-Chips - Rs30 \n 4.Samosa - Rs15 \n 5.Kachori - Rs15");
			int ch2 = sc.nextInt();
			switch (ch2) {
			case 1:
				System.out.println("Enter no. of qty");
				int sn1 = sc.nextInt();
				int sbl1 = sn1 * 20;
				System.out.println("Your bill is :-Rs " + sbl1);
				break;
			case 2:
				System.out.println("Enter no. of qty");
				int sn2 = sc.nextInt();
				int sbl2 = sn2 * 30;
				System.out.println("Your bill is :-Rs " + sbl2);
				break;
			case 3:
				System.out.println("Enter no. of qty");
				int sn3 = sc.nextInt();
				int sbl3 = sn3 * 30;
				System.out.println("Your bill is :-Rs " + sbl3);
				break;
			case 4:
				System.out.println("Enter no. of qty");
				int sn4 = sc.nextInt();
				int sbl4 = sn4 * 15;
				System.out.println("Your bill is :-Rs " + sbl4);
				break;
			case 5:
				System.out.println("Enter no. of qty");
				int sn5 = sc.nextInt();
				int sbl5 = sn5 * 15;
				System.out.println("Your bill is :-Rs " + sbl5);
				break;
			default:
				System.out.println("Invalid choice");
			}
			break;

		case 3:
			System.out.println("We have different options for Drinks choose anything");
			System.out.println("\n 1.Tea - Rs10 \n 2.Coffee - Rs20 \n 3.ColdDrinks - Rs20 \n 4.Mastani - Rs100 ");
			int ch3 = sc.nextInt();
			switch (ch3) {
			case 1:
				System.out.println("Enter no. of qty");
				int dn1 = sc.nextInt();
				int dbl1 = dn1 * 10;
				System.out.println("Your bill is :-Rs " + dbl1);
				break;
			case 2:
				System.out.println("Enter no. of qty");
				int dn2 = sc.nextInt();
				int dbl2 = dn2 * 20;
				System.out.println("Your bill is :-Rs " + dbl2);
				break;
			case 3:
				System.out.println("Enter no. of qty");
				int dn3 = sc.nextInt();
				int dbl3 = dn3 * 20;
				System.out.println("Your bill is :-Rs " + dbl3);
				break;
			case 4:
				System.out.println("Enter no. of qty");
				int dn4 = sc.nextInt();
				int dbl4 = dn4 * 100;
				System.out.println("Your bill is :-Rs " + dbl4);
				break;
			default:
				System.out.println("Invalid choice");
			}
			break;

		default:
			System.out.println("Invalid choice");
		}
		System.out.println("\nThank you ! \nvisit again...");
	}
}
