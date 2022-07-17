/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * @author az
 *
 */
public class SumOfChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		
		
		int sum = 0;
		for (int i=0;i<number;i++) {
		String	ch=scanner.next();
sum=sum+ch.charAt(0);
		
		}
		System.out.println("The total equals: "+sum);
	}

}
