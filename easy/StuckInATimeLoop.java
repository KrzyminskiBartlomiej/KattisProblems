package easy;

import java.util.Scanner;

/**
 * PROBLEM DESCRIPTION
 * 
 * Last night when you went to sleep, you had a strange feeling that you may see
 * the same day again. And your strange feeling came to when you woke up,
 * everyone seemed to think that it was yesterday morning! The same strange
 * feeling came back in the evening.
 * 
 * When this pattern continued for days, you looked for help from a time wizard.
 * The wizard says he can break you out of the time loop, but you must chant his
 * spell. The wizard gives you a magic number, and you must count up to that
 * number, starting at 1, saying “Abracadabra” each time.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class StuckInATimeLoop {
	public static void main(String[] args){
		Scanner scanInput = new Scanner(System.in);
		Integer howManyTimes = scanInput.nextInt();
		scanInput.close();
		
		for(int i = 1; i <= howManyTimes; i++){
			System.out.printf("%d Abracadabra\n", i);
		}		
	}
}
