package apr20assessment;

import java.util.Arrays;
import java.util.HashSet;

public class PanagramDetector {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy";

		String[] s1 = s.replaceAll(" ", "").toLowerCase().split("");

		String[] s2 = "abcdefghijklmnopqrstuvwxyz".split("");

		HashSet<String> hs1 = new HashSet<String>(Arrays.asList(s1));
		HashSet<String> hs2 = new HashSet<String>(Arrays.asList(s2));

		hs2.removeAll(hs1);

		System.out.println(hs2);

	}

}
