package easy;

import java.util.Scanner;

/**
 * PROBLEM DESCRIPTION
 * 
 * The impact factor of a scientific journal is a measure reflecting the average
 * number of citations to articles published in science journals.
 * 
 * Rounding is always performed upwards. For example the impact factor of the
 * “Journal for ore research and time wasting” that published 38 articles cited
 * 894 times is 894/38=23.53 rounding up to 24.
 * 
 * You are the editor of one scientific journal. You know how many articles you
 * are going to publish and the owners are pushing you to reach a specific
 * impact factor. You are wondering how many scientists you will have to bribe
 * to cite your articles to meet the owners demands. Since money is tight you
 * want to bribe the minimal amount of scientists. Each bribed scientist buys
 * you a single citation.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class Faktor {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		String storeInput = scanInput.nextLine();
		String[] dividedString = storeInput.split(" ");
		scanInput.close();
		
		System.out.println(Integer.parseInt(dividedString[0]) * (Integer.parseInt(dividedString[1]) - 1) + 1);
	}
}
