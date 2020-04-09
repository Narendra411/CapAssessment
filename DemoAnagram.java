package apr09assessment;

import java.util.Arrays;

public class DemoAnagram {

	public static boolean checkAnagram(String s1, String s2) {

		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			return false;
		} else {

			char[] ar1 = s1.toLowerCase().toCharArray();
			char[] ar2 = s2.toLowerCase().toCharArray();

			Arrays.sort(ar1);
			Arrays.sort(ar2);

			return Arrays.equals(ar1, ar2);

		}

	}

	public static void main(String[] args) {
		String s1 = "Motherinlaw";
		String s2 = "HitlerWoman";

		System.out.println(checkAnagram(s1, s2));

	}

}
