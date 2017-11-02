package medium;

import java.util.*;

public class Esej {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int A = scan.nextInt();
int B = scan.nextInt();

int min = Math.max(A , (B / 2) + 1);
int count = 0;

MainLoop:
for (char a = 'a'; a <= 'z'; a++)
	for (char b = 'a'; b <= 'z'; b++)
		for (char c = 'a'; c <= 'z'; c++)
			for (char d = 'a'; d <= 'z'; d++)
				{
				System.out.print("" + a + b + c + d + " ");
				
				count++;
				
				if (count == min)
					break MainLoop;
				}

scan.close();
	}
}