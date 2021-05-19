package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJun2217 {
	

	public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];		
			int size = n;
	        int min, temp, w, result;
			
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);


	        
	        result = arr[0]*n;
	        
	        for(int i = 1; i < n; i++) {
	        	w = arr[i] * (n-i);
	        	if(w > result) {
	        		result = w;
	        	}
	        }
	        
	        System.out.println(result);
        

	}

}
