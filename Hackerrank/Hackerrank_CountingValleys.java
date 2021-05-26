package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountingValleys {
	  // Problem Link: https://www.hackerrank.com/challenges/counting-valleys/problem?h_r=profile

    public static int countingValleys(int steps, String path) {
    	int altitude = 0;
    	int result = 0;
    	
    	for(int i = 0; i < steps; i++) {
    	
    		if(path.charAt(i) == 'U') {
    			if(altitude == -1) {
    				result++;
    			}
    			altitude++;
    		}else {
    			altitude--;
    		}

    	}
    	System.out.println(result);
    	return result;

    }
}

public class Hackerrank_CountingValleys {

	public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleys.countingValleys(steps, path);

        bufferedReader.close();

    }

}
