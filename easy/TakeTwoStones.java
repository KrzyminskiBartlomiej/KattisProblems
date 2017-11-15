package easy;

import java.util.Scanner;

/**
 * Alice and Bob are playing a new game of stones. There are N stones placed on
 * the ground, forming a sequence. The stones are labeled from 1 to N.
 * 
 * Alice and Bob in turns take exactly two consecutive stones on the ground
 * until there are no consecutive stones on the ground. That is, each player can
 * take stone i and stone i+1, where 1<=i<=N-1. If the number of stone
 * left is odd, Alice wins. Otherwise, Bob wins.
 * 
 * Assume both Alice and Bob play optimally and Alice plays first, do you know
 * who the winner is?
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stonesNumber = scan.nextInt();
		System.out.println(stonesNumber % 2 == 1 ? "Alice" : "Bob"); 
		scan.close();
	}
}
