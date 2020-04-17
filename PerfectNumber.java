package apr16assessment;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
	public static void main(String[] args) {
		List<Integer> perfectNumbersList = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			List<Integer> divList = new ArrayList<>();
			// GETTING LIST OF DIVISORS OF LIST
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					divList.add(j);
				}
			}
			// SUMMING DIVISORS OF EACH NUMBERS
			Integer sumOfDivisors = 0;
			for (Integer temp : divList) {
				sumOfDivisors +=  temp;
			}
			// ADDING PERFECT NUMBERS TO LIST
			if (sumOfDivisors == i)
				perfectNumbersList.add(i);
		}
		System.out.println("Perfect Numbers List..: " + perfectNumbersList);
	}
}