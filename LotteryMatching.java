package bnpexam;

import java.util.HashMap;
import java.util.Map;

public class LotteryMatching {

	public static void main(String[] args) {

		int n = 11;
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 1; i <= n; i++) {
			int sumOfDigit = 0;
			int digit = i;
			while (digit > 0) {
				int k = digit % 10;
				sumOfDigit += k;
				digit = digit / 10;
			}
			if (hm.containsKey(sumOfDigit)) {
				int count = hm.get(sumOfDigit);
				hm.put(sumOfDigit, ++count);
			} else {
				hm.put(sumOfDigit, 1);
			}

		}
		hm.forEach(
				(k, v) -> System.out.println("Sum of the numbers  -->" + k + " Count of numbers having this sum" + v));
		int maxValue = hm.values().stream().max(Integer::compare).get();
		System.out.println("Hightest value\t" + maxValue);
		
		int countOfMaxNumber = 0;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == maxValue) {
				countOfMaxNumber++;
			}
		}
		System.out.println("Final Output\t" + countOfMaxNumber);
	}

}
