package practice;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * There is a large pile of socks that must be paired by color.
     *  Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    	int result = 0;
    	HashSet<Integer> colors = new HashSet<Integer>();    	

    	for(int i = 0; i < ar.size(); i++) {
    		if(!colors.contains(ar.get(i))) {
    			colors.add(ar.get(i));
    		}else {
    			result++;
    			colors.remove(ar.get(i));
    		}
    	}
    	System.out.println(result);
    	return result;

    }

}

public class Hackerrank_SalesByMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
