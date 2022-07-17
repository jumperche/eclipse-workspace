package first;

import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		
		
		if (a.equals ("sunny")) {
			System.out.println("It's warm outside!");}
		 else 
			 System.out.println("It's cold outside!");
		 
		 
		scanner.close();  
	}
	}


