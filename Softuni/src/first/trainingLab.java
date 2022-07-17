package first;

import java.util.Scanner;

public class trainingLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double d=Double.parseDouble(scanner.nextLine());
		Double s=Double.parseDouble(scanner.nextLine());
		
		if (3<=s&&s<=d&&d<=100) {
			s=s*100-100;
			d=d*100;
			double r=Math.floor(s/70);
			double c=Math.floor(d/120);
			double result=Math.floor(r*c-3);
			System.out.printf("%.0f",result);
			scanner.close(); }
			else {System.out.println("Error!");	 }
			scanner.close();
		}
		
}


