package first;

import java.util.Scanner;

public class trade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 
       String town=scanner.nextLine();
       double x=Double.parseDouble(scanner.nextLine());
	switch (town) { 
	case "Sofia":
		if ((x>=0)&&(x<=500)){
			double price=x*5/100;
			System.out.printf("%.2f",price);		}
			if ((x>500)&&(x<=1000)) {
				double price=x*7/100;
				System.out.printf("%.2f",price);		}
				if ((x>1000)&&(x<=10000)) {
					double price=x*8/100;
					System.out.printf("%.2f",price);		}
				if ((x>10000)) {
					double price=x*12/100;
					System.out.printf("%.2f",price);		}
				break;
				
	case "Varna":
		if ((x>=0)&&(x<=500)){
			double price=x*4.5/100;
			System.out.printf("%.2f",price);		}
			if ((x>500)&&(x<=1000)) {
				double price=x*7.5/100;
				System.out.printf("%.2f",price);		}
				if ((x>1000)&&(x<=10000)) {
					double price=x*10/100;
					System.out.printf("%.2f",price);		}
				if ((x>10000)) {
					double price=x*13/100;
					System.out.printf("%.2f",price);		}
				break;
		
	case "Plovdiv":
		if ((x>=0)&&(x<=500)){
			double price=x*5.5/100;
			System.out.printf("%.2f",price);		}
		
			if ((x>500)&&(x<=1000)) {
				double price=x*8/100;
				System.out.printf("%.2f",price);		}
				if ((x>1000)&&(x<=10000.00)) {
					double price=x*12/100;
					System.out.printf("%.2f",price);		}
					if ((x>10000.00)) {
						double price=x*14.5/100;
						System.out.printf("%.2f",price);}		
						if (x<0) {
							System.out.println("error");}
										
				break;
				 
 	default:
 		System.out.println("error");
 		break;
	}
	}
}

