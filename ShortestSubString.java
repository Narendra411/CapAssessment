package apr10assessment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShortestSubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		char[] ar = s.toCharArray();
		Set<Character> st = new HashSet<Character>();
		for (char i : ar)
			st.add(i);
		System.out.println(st.size());

	}

}
