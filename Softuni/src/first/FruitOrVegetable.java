package first;

import java.util.Scanner;

public class FruitOrVegetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
       
        String day=scanner.nextLine();
	switch (day) { 
	case "banana":
		
     case "apple":
    	 
     case "kiwi":
    	 
     case "cherry":
    	
     case "lemon":
    	
     case "grapes":
    	 
  			System.out.println("fruit");
  		break;
     case "tomato":
     case "cucumber":
     case "pepper":
     case "carrot":
    	 System.out.println("vegetable");
    	 break;
     	
     	default:
     		System.out.println("unknown");
     		break;
        
        }
	}

}
