package apr10assessment;

import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPer = scan.nextInt();
		int taxPer = scan.nextInt();
		scan.close();

		int totalCost = (int) ((int) (mealCost) + (mealCost * tipPer / 100) + (mealCost * taxPer / 100));

		System.out.println(totalCost);

	}

}
