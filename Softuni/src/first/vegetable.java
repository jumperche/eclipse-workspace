package first;

import java.util.Scanner;

public class vegetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double veg=Double.parseDouble(scanner.nextLine());
		Double fruit=Double.parseDouble(scanner.nextLine());
		int vegKg=Integer.parseInt(scanner.nextLine());
		int fruitKg=Integer.parseInt(scanner.nextLine());
		double result=(veg*vegKg)+(fruit*fruitKg);
		result=result/1.94;
		System.out.printf("%.2f",result);
		scanner.close(); 
	}

}
