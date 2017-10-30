package medium;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Virtually every single book, play, movie, novel, and game has at least one
 * character. Most have more, and some even have thousands! As every good writer
 * knows, the difficulty of creating a character increases with each new major
 * character added. This is because fictional characters are truly developed
 * through their relationships with others.
 * 
 * If there are no characters or only one character, no relationships need to be
 * explored. With two characters, there is one relationship. If there are three
 * characters, however, there are four relationships: the ones between each pair
 * of characters, and finally the relationship when all three are together. In
 * general, the relationship between all subsets of at least two characters must
 * be explored.
 * 
 * Given a literary work with N characters, how many relationships need to be
 * explored?
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class CharacterDevelopment {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		Integer howManyTimes = scanInput.nextInt();
		scanInput.close();
		BigInteger summary = BigInteger.ZERO;

		/**
		 * To find how many possible relations can be between each point and
		 * subset, pattern for combinations without repetitions can be used. In
		 * that case i value stands for number of elements in subset from
		 * howManyTimes elements set. Each value returned from pattern is added
		 * to summary which stores number of possible relations.
		 * 
		 */

		for (Integer i = 2; i <= howManyTimes; i++) {
			summary = summary.add(combinationWithoutReps(BigInteger.valueOf(i.intValue()),
					BigInteger.valueOf(howManyTimes.intValue())));
		}
		System.out.println(summary);
	}

	/**
	 * Method that uses combinations without repetitions pattern.
	 * 
	 * @param k
	 *            length of subset
	 * @param n
	 *            length of main set
	 * @return number of combinations without repetitions
	 * 
	 */

	static BigInteger combinationWithoutReps(BigInteger k, BigInteger n) {
		return strong(n).divide((strong(k).multiply(strong(n.subtract(k)))));
	}

	/**
	 * Recursion used to create strong value which means X!
	 * 
	 * @param strongValue
	 *            value to be !
	 * @return while the strongValue isn't less than one is multiplied by self -
	 *         1
	 *         
	 */

	static BigInteger strong(BigInteger strongValue) {
		if (strongValue.compareTo(BigInteger.ONE) == -1)
			return BigInteger.ONE;
		else
			return strongValue.multiply(strong(strongValue.subtract(BigInteger.ONE)));
	}
}
