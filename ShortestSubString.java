package apr10assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShortestSubString {

	public static int shortestSubString(String s) {

		List<String> s1 = Arrays.asList(s.split(""));
		List<String> ul = s1.stream().distinct().collect(Collectors.toList());
		List<String> ssl = new ArrayList<String>();
		int n = s1.size();
		for (int i = 0; i < n; i++) {
			ssl.add(s1.get(i));
			if (ssl.containsAll(ul)) {
				if (ssl.size() < n) {
					n = ssl.size();
					ssl.clear();
				} else
					ssl.clear();

			}

		}

		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = shortestSubString(s);
		scan.close();
		System.out.println(n);

	}

}
