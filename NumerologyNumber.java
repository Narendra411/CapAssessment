package apr20assessment;

import java.util.HashMap;
import java.util.Map;

public class NumerologyNumber {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>() {
			{
				put("A", 1);
				put("I", 1);
				put("J", 1);
				put("Q", 1);
				put("Y", 1);
				put("B", 2);
				put("K", 2);
				put("R", 2);
				put("C", 3);
				put("G", 3);
				put("L", 3);
				put("S", 3);
				put("D", 4);
				put("M", 4);
				put("T", 4);
				put("E", 5);
				put("H", 5);
				put("N", 5);
				put("X", 5);
				put("U", 6);
				put("V", 6);
				put("W", 6);
				put("O", 7);
				put("Z", 7);
				put("F", 8);
				put("P", 8);
			}
		};

		String s = "S. KANAPATHY";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (Character.toString(s.charAt(i)).equalsIgnoreCase(entry.getKey()))
					sum += entry.getValue();
			}
		}
		while (sum > 9) {
			sum = (sum / 10 + sum % 10);
		}
		System.out.println("Sum...: " + sum);

	}
}
