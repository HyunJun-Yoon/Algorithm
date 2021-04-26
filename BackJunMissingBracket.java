package practice;

import java.io.IOException;
import java.util.Scanner;

public class BackJunMissingBracket {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE; 
		System.out.println(sum);
		String[] subtraction = in.nextLine().split("-");
	
		for(int i = 0; i < subtraction.length; i++) {
			int temp = 0;
	
			String[] addition = subtraction[i].split("\\+");
	
			for(int j = 0; j < addition.length; j++) {
			temp += Integer.parseInt(addition[j]);
			System.out.println(temp);
			}
			
			if (sum == Integer.MAX_VALUE) {
			sum = temp;
			} else {
			sum -= temp;
			}
			System.out.println(temp + "tmep");
		}
		System.out.println(sum);
//		
//		int positiveSum = 0;
//		int negativeSum = 0;
//		int result = 0;
//		String str = in.next();
//		System.out.println(str);
//		String[] arr = str.split("-");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		
//		
//		
//		
//		negativeSum +=  Integer.parseInt(arr[0]);
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i].contains("\\+")) {
//				String[] arr2 = arr[i].split("\\+");	
//				for(int j = 0; j < arr2.length; j++) {
//					System.out.println(arr2[j]);
//					positiveSum += Integer.parseInt(arr2[j]);
//				}
//			} else {
//				negativeSum += Integer.parseInt(arr[i]);
//			}
//		}
//		
//		result = negativeSum - positiveSum;
//		
//		System.out.println(result);

	}

}
