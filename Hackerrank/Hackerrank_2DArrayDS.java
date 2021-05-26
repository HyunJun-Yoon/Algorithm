package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Problem Link: https://www.hackerrank.com/challenges/2d-array/problem?h_r=profile

class ArrayDS {
	public static int hourglassSum(List<List<Integer>> arr) {
			int sum = -63;
			int max = -63;
			
	    	for(int i = 1; i < 5; i++) {	    		
	    		for(int j = 1; j < 5; j++) {

	    			sum = arr.get(i-1).get(j-1) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) + arr.get(i).get(j) + arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1); 	    		
	    			if(sum > max) {
		    			max = sum;
		    		}	 
	    		}
	    	   		
	    	}
	        	
	    	System.out.println(max);
	
	    	return max;
	    }
}

public class Hackerrank_2DArrayDS {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = ArrayDS.hourglassSum(arr);

        bufferedReader.close();
    }

}
