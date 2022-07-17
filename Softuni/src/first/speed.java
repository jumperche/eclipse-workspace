package first;

import java.util.Scanner;

public class speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double a=Double.parseDouble(scanner.nextLine());
		
		
		if (a<=10) {
			System.out.println("slow");}
		 else if (a<=50)  {
			 System.out.println("average");}
		 else if (a<=150){ 
		System.out.println("fast");}
		 else if (a<=1000){ 
				System.out.println("ultra fast");}
		 else {System.out.println("extremely fast");}
		scanner.close();  
	}

}
