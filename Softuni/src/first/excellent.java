package first;

import java.util.Scanner;

public class excellent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int grade=Integer.parseInt(scanner.nextLine());
		
		if (grade>=5) {
			System.out.println("Excellent!");
			scanner.close();  
		}
	}

}
