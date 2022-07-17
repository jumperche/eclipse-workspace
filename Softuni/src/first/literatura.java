package first;

import java.util.Scanner;

public class literatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int stranici=Integer.parseInt(scanner.nextLine());
		int chas=Integer.parseInt(scanner.nextLine());
		int dni=Integer.parseInt(scanner.nextLine());
		
		int result=(stranici/chas)/dni;
		System.out.println(result);
		scanner.close();  
				
	}

}
