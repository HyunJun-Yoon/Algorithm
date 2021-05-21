package practice;

import java.io.IOException;
import java.util.Scanner;

// Problem Link: https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class Hackerrank_MinimumSwap2 {

	static int minimumSwaps(int[] arr) {
	        int len = arr.length;
	        int result = 0;

	        for(int i = 0; i<len; )
	        {
	            if(arr[i] != (i+1))
	            {
	                int idx = arr[i]; 
	                int temp = arr[idx-1];
	                arr[idx-1] = arr[i];
	                arr[i] = temp;
	                result++;
	            }
	            else
	                i++;
	        }

	        return result;
	    }
	
	private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        scanner.close();
	}

}

//int result = 0;
//
//for(int i = 0; i < arr.length; i++) {
//	System.out.println(("asd"));
//	if(i+1 != arr[i]) {
//		for(int j = 0; j < arr.length; j++) {
//			if((i + 1) == arr[j]) {
//				int tmp = arr[j];
//				arr[j] = arr[i];
//				arr[i] = tmp;
//				result++;
//
//			}
//		}
//	}
//}
//
//
//System.out.println(result);
//return result;
