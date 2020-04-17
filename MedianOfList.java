package apr16assessment;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


// download commons-lang3-3.10.jar from apache site

public class MedianOfList {
	public static void main(String[] args) {
		int[] array1 = {2,3,6,7,9};
		int[] array2 = {-1,4,8,10,11};
		int[] combinedArray = ArrayUtils.addAll(array1, array2);
		Arrays.sort(combinedArray);
		
		double median = 0.00;
		if(combinedArray.length % 2 != 0) {
			median = combinedArray[combinedArray.length/2];
		}else {
			median = (combinedArray[(combinedArray.length/2)-1] + combinedArray[combinedArray.length/2])/2;
		}
		System.out.printf("Median..: %.2f",median);
	}
}