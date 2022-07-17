/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * @author az
 *
 */
public class ReverseArrayOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input=scanner.next().split(" ");
		for (int i=0;i<input.length/2;i++) {
			String x="";
			x=input[i];
			input[i]=input[input.length-i];
					input[input.length-i]=x;
		}
		for (int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
}

