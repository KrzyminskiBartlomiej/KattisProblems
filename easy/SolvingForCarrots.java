package easy;

import java.util.Scanner;

/**
 * Carrots are good for you! First of all, they give you good night vision.
 * Instead of having your lights on at home, you could eat carrots and save
 * energy! Ethnomedically, it has also been shown that the roots of carrots can
 * be used to treat digestive problems. In this contest, you also earn a carrot
 * for each difficult problem you solve, or huffle-puff problems as we prefer to
 * call them. You will be given the number of contestants in a hypothetical
 * contest, the number of huffle-puff problems that people solved in the contest
 * and a description of each contestant. Now, find the number of carrots that
 * will be handed out during the contest.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class SolvingForCarrots {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contestants = scan.nextInt();
		int hufflePuffs = scan.nextInt();

		for (int i = 0; i < contestants; i++) {
			scan.nextLine();
		}
		System.out.println(hufflePuffs);
		scan.close();
	}
}
