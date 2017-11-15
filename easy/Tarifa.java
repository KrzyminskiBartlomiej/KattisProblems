package easy;

import java.util.Scanner;

/**
 * Pero has negotiated a Very Good data plan with his internet provider. The
 * provider will let Pero use up X megabytes to surf the internet per month.
 * Each megabyte that he doesn’t spend in that month gets transferred to the
 * next month and can still be spent. Of course, Pero can only spend the
 * megabytes he actually has.
 * 
 * If we know how much megabytes Pero has spent in each of the first NN months
 * of using the plan, determine how many megabytes Pero will have available in
 * the N+1 month of using the plan.
 * 
 * @author Krzyminski Bartlomiej
 *
 */

public class Tarifa {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int megabyteLimit = scan.nextInt();
		int months = scan.nextInt();
		int tarifa = megabyteLimit;
		
		for(int i = 0; i < months; i++){
			tarifa += megabyteLimit - scan.nextInt();
		}
		
		System.out.println(tarifa);
		scan.close();
	}
}
