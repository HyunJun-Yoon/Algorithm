package dataStructure;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 1, 5, 8, 10, 24, 3, 5, 100, 99, 7 };
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] prefix_sum = new int[11];
		int[] prefix_sum2 = new int[11];
		for(int i = 1; i < arr.length; i++) {
			prefix_sum[i] += prefix_sum[i-1] + arr[i];
			prefix_sum2[i] += prefix_sum2[i-1] + arr2[i];
		}
		
		System.out.println(prefix_sum[b] - prefix_sum[a-1]);
		System.out.println(prefix_sum2[b] - prefix_sum2[a-1]);
		sc.close();
		

	}

}
