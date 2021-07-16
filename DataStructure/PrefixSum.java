package dataStructure;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		int n = 5; 
		int[] data = { 10, 20, 30, 40, 50 };
		
		int summary = 0;
		int[] prefix_sum = new int[n+1];
		prefix_sum[0] = 0;
		
		for(int i = 0; i < data.length; i++) {
			summary += data[i];
			prefix_sum[i+1] = summary;
		}
		int left = 3;
		int right = 4;
		System.out.println(prefix_sum[right] - prefix_sum[left-1]);

	}

}
