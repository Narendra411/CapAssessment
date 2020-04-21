package apr20assessment;

import java.util.Arrays;
import java.util.List;

public class ShortestArraylength {

	public static void main(String[] args) {

		int[][] s1 = { { 1, 2, 3, 4 }, { 0, 2, 7 }, { 4, 12 }, { 1, 2, 5, 6 } };

		List<int[]> list = Arrays.asList(s1);

		int[] ar = new int[list.size()];

		for (int i = 0; i < list.size(); i++)
			ar[i] = list.get(i).length;

		Arrays.sort(ar);
		System.out.println(ar[0]);// minimum length

	}

}
