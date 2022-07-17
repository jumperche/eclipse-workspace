package first;

import java.util.Scanner;

public class radian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
double radians=Double.parseDouble(scanner.nextLine());
double grad=radians*180/Math.PI;
System.out.println(grad);
scanner.close();  
	}

}
