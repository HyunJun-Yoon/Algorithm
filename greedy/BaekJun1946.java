package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJun1946 {
	public static void main(String[] args) throws Exception { 
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int result = 0;
		int a = 0;
	    int[] arr1,arr2,arr3,arr4;
	    
	    for(int i = 0; i < t; t++) {
		    int n = Integer.parseInt(br.readLine());
		    arr1 = new int[n];
		    arr2 = new int[n];
		    arr3 = new int[n];
		    arr4 = new int[n];
		    	for(int j = 0; j < n; j++) {
		    		arr1[j] = Integer.parseInt(br.readLine());
		    		arr2[j] = Integer.parseInt(br.readLine());
		    	
		    		if(arr1[j] == 1 || arr2[j] == 1) {
		    			result++;
		    		} else {
		    			arr3[a] = arr1[j];
		    			arr4[a] = arr2[j];
		    			a++;
		    		}
		    		
		    	}
		    	
		    	int min = arr3[0];
		    	int minP = 0;
	    		for(int j = 1; j < a; j++) {
	    			if(min > arr3[j]) {
	    				min = arr3[j];
	    				minP = j;
	    			}
	    		}
	    		
	    		if(arr4[minP] != a) {
	    			result++;
	    		}
		}		    
		    
	}
}
	