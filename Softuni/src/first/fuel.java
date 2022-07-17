package first;

import java.util.Scanner;

public class fuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String fuel=scanner.nextLine();
		double liter=Double.parseDouble(scanner.nextLine());
        
       if (!(fuel.equals("Diesel")||fuel.equals("Gasoline")||fuel.equals("Gas"))) {
    	   System.out.println("Invalid fuel!" );}
       else if (liter<25) {
    	   System.out.println("Fill your tank with "+ fuel.toLowerCase()+"!" );}
       else if (liter>=25) {
    	   System.out.println("You have enough "+ fuel.toLowerCase()+ "." );}
       }
    	   
			
        }
	
	


