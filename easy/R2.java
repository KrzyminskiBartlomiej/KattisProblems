package easy;

import java.util.Scanner;

/**
 * PROBLEM DESCRIPTION
 * 
 * The number S is called the mean of two numbers R1 and R2 if S is equal to
 * (R1+R2)/2. Mirko’s birthday present for Slavko was two integers R1 and R2.
 * Slavko promptly calculated their mean which also happened to be an integer
 * but then lost R2! Help Slavko restore R2.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class R2 {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		String storeInput = scanInput.nextLine();
		String[] dividedString = storeInput.split(" ");

		System.out.println((Integer.parseInt(dividedString[1]) * 2) - Integer.parseInt(dividedString[0]));

		scanInput.close();
	}
}
