package dataStructure;

public class TwoPointers {

	public static void main(String[] args) {
		int n = 5, m = 5;
		int[] data = { 1, 2, 3, 2, 5 };
		
		int result = 0;
		int summary = 0;
		int end = 0;
		
		for(int start = 0; start < n; start++) {
			while(summary < m && end < n) {
				summary += data[end];
				end += 1;
			}
			
			if(summary == m) {
				result += 1;
			}
			summary -= data[start];

		}
		System.out.println(result);
	}

}
