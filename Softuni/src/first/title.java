package first;

import java.util.Scanner;

public class title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		double age=Double.parseDouble(scanner.nextLine());
		String gender=scanner.nextLine();
		if ("m".equals(gender)) {
			if (age>=16) {
			System.out.printf("Mr.");}
				else {System.out.printf("Master");}
		}
			else if ("f".equals(gender)) {
				if (age>=16) {
					System.out.printf("Ms.");}
					else {System.out.printf("Miss");}
			}
		}
	}


