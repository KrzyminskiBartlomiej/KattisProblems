package medium;

import java.util.*;

/**
 * The impending doom called final examination is approaching this year’s high
 * school seniors: one of the compulsory tasks is going to be writing an essay
 * in their mother tongue. Mirko is under the impression that certain political
 * parties are going to keep their promises, those regarding informatization and
 * digitalization, which is why he thinks that this year’s essays are going to
 * be marked by a computer, instead of a human.
 * 
 * To test his doubts, Mirko is going to write an essay that doesn’t necessarily
 * make sense at all, but should pass the automatic basic conditions check. The
 * essay passes the check if<br>
 * <br>
 * - it contains at least A, and at most B words;<br>
 * - every word contains at least one, and at most 15 letters;<br>
 * - the used vocabulary is large enough, in other words, the essay contains at
 * least B/2 different words. <br>
 * <br>
 * Mirko was up late last night watching Big Brother, so he is asking you to
 * write such an essay instead of him. The essay should be output in a single
 * line, using only lowercase letters of the English alphabet and spaces
 * (therefore, without punctuation such as dots, commas and such). The words
 * used can, but need not be, words from the English (or any) language.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class Esej {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		int min = Math.max(A, (B / 2) + 1);
		int count = 0;

		MainLoop: for (char a = 'a'; a <= 'z'; a++)
			for (char b = 'a'; b <= 'z'; b++)
				for (char c = 'a'; c <= 'z'; c++)
					for (char d = 'a'; d <= 'z'; d++) {
						System.out.print("" + a + b + c + d + " ");

						count++;

						if (count == min)
							break MainLoop;
					}

		scan.close();
	}
}