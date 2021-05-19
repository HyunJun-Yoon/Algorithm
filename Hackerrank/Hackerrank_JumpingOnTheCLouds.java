package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result1 {

    /*
     * 
     * There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. 
     * The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2. 
     * The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. 
     * It is always possible to win the game.

	  For each game, you will get an array of clouds numbered 0  if they are safe or 1 if they must be avoided
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
    	int current = c.get(0);
    	int result = 0;

    	while(current < c.size() - 1) {
    		System.out.println("Current: " + current);
    		if(current+1 < c.size() && c.get(current+1) == 0) {
    			if(current+2 < c.size() && c.get(current+2) == 0) {
    				current = current+2;
    				System.out.println("1 Plus 1");
    				result++;
    			}else {
    				current = current+1;
    				System.out.println("2 Plus 1");
    				result++;
    			}
    		}else{
    			current = current+2;
    			System.out.println("3 Plus 1");
    			result++;
    		}
    	}
    	System.out.println(result);
		return result;


    }

}

public class Hackerrank_JumpingOnTheCLouds {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> c = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cTemp[i]);
	            c.add(cItem);
	        }

	        int result = Result1.jumpingOnClouds(c);

	        bufferedReader.close();

	    }

}
