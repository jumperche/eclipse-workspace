package first;

import java.util.Scanner;

public class circleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double radius=Double.parseDouble(scanner.nextLine());
		double area=Math.PI*radius*radius;
		double are=Math.PI*2*radius;
		System.out.printf("%.2f\n",area);
		System.out.printf("%.2f",are);
		scanner.close(); 
		
				
	}

}
