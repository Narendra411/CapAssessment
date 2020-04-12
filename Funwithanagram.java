package apr10assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Funwithanagram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String s[] = new String[n];

		for (int i = 0; i < s.length; i++) {
			s[i] = scan.next();
		}
		funWithAnagram(s, n);
		scan.close();
	}

	public static void funWithAnagram(String[] s, int n) {
		List<String> slist = new ArrayList<String>(Arrays.asList(s));
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (isAnagaram(s[i], s[j])) {
					// System.out.println(s[i] + " is anagram with " + s[j] + " hence moving s[j]");
					if (slist.contains(s[j])) {
						slist.remove(s[j]);
					}
				}

		for (String finallist : slist)
			System.out.println(finallist);

	}

	public static boolean isAnagaram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			char[] c1 = s1.replaceAll(" ", "").toLowerCase().toCharArray();
			char[] c2 = s2.replaceAll(" ", "").toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);

		}
	}

}
