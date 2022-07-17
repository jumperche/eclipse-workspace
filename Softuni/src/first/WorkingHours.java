package first;

import java.util.Scanner;

public class WorkingHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double x=Double.parseDouble(scanner.nextLine());
        String day=scanner.nextLine();
	switch (day) { 
	case "Monday":
		if ((x>=10)&&(x<18)) {
			System.out.println("open");}
		else {System.out.println("closed");}
		break;
     case "Tuesday":
    	 if ((x>=10)&&(x<18)) {
 			System.out.println("open");}
 		else {System.out.println("closed");}
 		break;
     case "Wednesday":
    	 if ((x>=10)&&(x<18)) {
 			System.out.println("open");}
 		else {System.out.println("closed");}
 		break;
     case "Thursday":
    	 if ((x>=10)&&(x<18)) {
 			System.out.println("open");}
 		else {System.out.println("closed");}
 		break;
     case "Friday":
    	 if ((x>=10)&&(x<18)) {
 			System.out.println("open");}
 		else {System.out.println("closed");}
 		break;
     	
     case "Saturday":
    	 if ((x>=10)&&(x<18)) {
  			System.out.println("open");}
  		else {System.out.println("closed");}
    	 break;
     case "Sunday":
    	 System.out.println("closed");
    	 break;
     	
     	default:
     		System.out.println("Error");
     		break;
        
        }
        
        
        
	}

}
