package easy;

import java.util.Scanner;

/**
 * When determining the age of a bull moose, the number of tines (sharp points),
 * extending from the main antlers, can be used. An older bull moose tends to
 * have more tines than a younger moose. However, just counting the number of
 * tines can be misleading, as a moose can break off the tines, for example when
 * fighting with other moose. Therefore, a point system is used when describing
 * the antlers of a bull moose. The point system works like this: If the number
 * of tines on the left side and the right side match, the moose is said to have
 * the even sum of the number of points. So, “an even 6-point moose”, would have
 * three tines on each side. If the moose has a different number of tines on the
 * left and right side, the moose is said to have twice the highest number of
 * tines, but it is odd. So “an odd 10-point moose” would have 5 tines on one
 * side, and 4 or less tines on the other side.
 * 
 * Can you figure out how many points a moose has, given the number of tines on
 * the left and right side?
 * 
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class JudgingMoose {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		String storeInput = scanInput.nextLine();
		String[] dividedString = storeInput.split(" ");
		scanInput.close();

		if (Integer.parseInt(dividedString[0]) == Integer.parseInt(dividedString[1])
				&& Integer.parseInt(dividedString[0]) == 0) {
			System.out.println("Not a moose");
		} else if (Integer.parseInt(dividedString[0]) == Integer.parseInt(dividedString[1])
				&& Integer.parseInt(dividedString[0]) != 0) {
			System.out.printf("Even %d\n", 2 * Integer.parseInt(dividedString[0]));
		} else {
			System.out.printf("Odd %d\n", 2 * (Integer.parseInt(dividedString[0]) > Integer.parseInt(dividedString[1])
					? Integer.parseInt(dividedString[0]) : Integer.parseInt(dividedString[1])));
		}
	}
}
