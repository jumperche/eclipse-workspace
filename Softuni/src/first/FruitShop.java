package first;

import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 String fruit=scanner.nextLine();
        String day=scanner.nextLine();
        double x=Double.parseDouble(scanner.nextLine());
	switch (fruit) { 
	case "banana":
		if (day.equals("Saturday")||day.equals("Sunday")) {
			double price=2.70*x;
			System.out.printf("%.2f",price);		}
		else {double price=2.50*x;
		System.out.printf("%.2f",price);		}
		break;
     case "apple":
    	 if (day.equals("Saturday")||day.equals("Sunday")) {
 			double price=1.250*x;
 			System.out.printf("%.2f",price);		}
    	 
 		else if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thuesday")||day.equals("Friday"))
 		{double price=1.20*x;
 		System.out.printf("%.2f",price);		}
 		else {System.out.printf("error");		}
    	 break;
     case "orange":
    	 if (day.equals("Saturday")||day.equals("Sunday")) {
 			double price=0.90*x;
 			System.out.printf("%.2f",price);		}
 		else {double price=0.85*x;
 		System.out.printf("%.2f",price);		}
    	 break;
     case "grapefruit":
    	 if (day.equals("Saturday")||day.equals("Sunday")) {
 			double price=1.60*x;
 			System.out.printf("%.2f",price);		}
 		else {double price=1.45*x;
 		System.out.printf("%.2f",price);		}
    	 break;
     case "kiwi":
    	 if (day.equals("Saturday")||day.equals("Sunday")) {
 			double price=3.00*x;
 			System.out.printf("%.2f",price);		}
 		else {double price=2.70*x;
 		System.out.printf("%.2f",price);		}
    	 break;
     case "pineapple":
    	 if (day.equals("Saturday")||day.equals("Sunday")) {
 			double price=5.60*x;
 			System.out.printf("%.2f",price);		}
 		else {double price=5.50*x;
 		System.out.printf("%.2f",price);		}
    	 break;
     case "grapes":
    	 if (day.equals("Saturday")||day.equals("Sunday")) {
 			double price=4.20*x;
 			System.out.printf("%.2f",price);		}
 		else {double price=3.85*x;
 		System.out.printf("%.2f",price);		}
    	 break;
     	default:
     		System.out.println("error");
     		break;
        
	}
	}
}
