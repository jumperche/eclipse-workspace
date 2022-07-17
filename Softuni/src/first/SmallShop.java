package first;

import java.util.Scanner;

public class SmallShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String product=scanner.nextLine();
		String town=scanner.nextLine();
		double st=Double.parseDouble(scanner.nextLine());
		
		switch (product) {
		case "coffee":
			if (town.equals("Sofia")){
				double price=st*0.50;
			System.out.printf("%.2f", price); }
			else if (town.equals("Plovdiv")){
				double price=st*0.40;
				System.out.printf("%.2f", price); }
			else if (town.equals("Varna")){
				double price=st*0.45;
				System.out.printf("%.2f", price); }
			break;
		case "water":
			if (town.equals("Sofia")){
				double price=st*0.80;
				System.out.printf("%.2f", price); }
			else if (town.equals("Plovdiv")){
				double price=st*0.70;
				System.out.printf("%.2f", price); }
			else if (town.equals("Varna")){
				double price=st*0.7;
				System.out.printf("%.2f", price); }
			break;
		case "beer":
			if (town.equals("Sofia")){
				double price=st*1.20;
				System.out.printf("%.2f", price); }
			else if (town.equals("Plovdiv")){
				double price=st*1.15;
				System.out.printf("%.2f", price); }
			else if (town.equals("Varna")){
				double price=st*1.1;
				System.out.printf("%.2f", price); }
			break;
		case "sweets":
			if (town.equals("Sofia")){
				double price=st*1.45;
				System.out.printf("%.2f", price); }
			else if (town.equals("Plovdiv")){
				double price=st*1.3;
				System.out.printf("%.2f", price); }
			else if (town.equals("Varna")){
				double price=st*1.35;
				System.out.printf("%.2f", price); }
			break;
		case "peanuts":
			if (town.equals("Sofia")){
				double price=st*1.6;
				System.out.printf("%.2f", price); }
			else if (town.equals("Plovdiv")){
				double price=st*1.50;
				System.out.printf("%.2f", price); }
			else if (town.equals("Varna")){
				double price=st*1.55;
				System.out.printf("%.2f", price); }
			break;
		default:
			System.out.printf("%.2f error"); 
		}
		
	}

}
