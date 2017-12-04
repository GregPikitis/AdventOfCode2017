package Day3;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Day3Part1 {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		/*

		37 36 35 34 33 32 31
		38 17 16 15 14 13 30
		39 18 05 04 03 12 29
		40 19 06 01 02 11 28
		41 20 07 08 09 10 27
		42 21 22 23 24 25 26
		43 44 45 46 47 48 49 50
		 */

		System.out.print("Puzzle Input: ");
		double input = scanner.nextInt();
		double rightCorner = 1;
		double sideNums = 1;

		for (int ring = 1; rightCorner <= input; ring++) {
			System.out.println("----------------");

			if (ring == 1) {
				sideNums = 1;
			} else if (ring == 2) {
				sideNums = 3;
			} else {
				sideNums = sideNums + 2;
			}
			rightCorner = Math.pow(sideNums, 2);
			System.out.println("ring: " + ring);
			System.out.println("SideNums: " + sideNums);
			System.out.println("rightCorner: " + rightCorner);
		}
		System.out.println("-------------");
		System.out.println("To Find Coords of right corner,");

		double x = ((sideNums - 1) / 2) + 1;

		double y = (x + 1) * -1;

		System.out.println("Coords are: (" + x + "," + y + ")");

		if (input >= (rightCorner - (sideNums - 1))){
			System.out.println("num is within 1 side.");
		}

		System.out.println("The right corner is this far away from the input: " + (rightCorner - input));



		System.out.print("input coordinate x: ");
		int coordx = scanner.nextInt();

		System.out.print("input coordinate y: ");
		int coordy = scanner.nextInt();

		System.out.println("Distance from 0,0: " + ((abs(coordx-0)) + (abs(coordy-0))));




	}
}
