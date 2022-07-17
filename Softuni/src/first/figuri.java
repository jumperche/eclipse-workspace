package first;

import java.util.Scanner;

public class figuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		
		
		if (a.equals("square")) {
			
			Double square=Double.parseDouble(scanner.nextLine());
			Double result=square*square;
			System.out.printf("%.3f",result);}
		
		 else if (a.equals("rectangle"))  {
			
				Double rec=Double.parseDouble(scanner.nextLine());
				Double rec1=Double.parseDouble(scanner.nextLine());
				Double result=rec1*rec;
				System.out.printf("%.3f",result);}
		
		 else if (a.equals("circle")){ 
			
				Double rec=Double.parseDouble(scanner.nextLine());
				Double result=rec*rec*Math.PI;
				System.out.printf("%.3f",result);}
		
		 else if (a.equals("triangle")){ 
			 
				Double rec=Double.parseDouble(scanner.nextLine());
				Double rec1=Double.parseDouble(scanner.nextLine());
				Double result=(rec1*rec)/2;
				System.out.printf("%.3f",result);}
		 else {System.out.println("not a geo");}
		 scanner.close();  
	}

}
