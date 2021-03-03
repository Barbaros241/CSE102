/**
 * @author Metehan Ünal
 * @since 02.03.2021
 */
package LabCSE102;
import java.util.Random;
import java.util.Arrays;

public class Lab01_20190808022 {
	public static int[] Shuffle(int[] array) {
		for(int i = 0; array.length>i;i++) {
			if(i%2 == 0) {
				Random rand = new Random();
				int randomNum = rand.nextInt((array.length)/2) *2;
				int k = array[i];
				array[i] = array[randomNum];
				array[randomNum] = k;
			}
			if (i%2 != 0) {
				Random rand = new Random();
				int randomNum = rand.nextInt((array.length)/2) *2+1;
				int k = array[i];
				array[i] = array[randomNum];
				array[randomNum] = k;
			}
		}
			return array;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		Shuffle(array);
		System.out.println(Arrays.toString(array));

	}

}
