package easy;

import java.util.Scanner;

/**
 * A common problem in mathematics is to determine which quadrant a given point
 * lies in. There are four quadrants, numbered from 1 to 4. For example, the
 * point A, which is at coordinates (12,5) lies in quadrant 1 since both its x
 * and y values are positive, and point B lies in quadrant 2 since its x value
 * is negative and its y value is positive.
 * 
 * Your job is to take a point and determine the quadrant it is in. You can
 * assume that neither of the two coordinates will be 0.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class QuadrantSelection {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		Integer xValue = scanInput.nextInt();
		Integer yValue = scanInput.nextInt();
		scanInput.close();

		if (xValue > 0) {
			if (yValue > 0) System.out.println(1);			
			else System.out.println(4);				
		} else {
			if (yValue > 0) System.out.println(2);				
			else System.out.println(3);				 
		}
	}
}
