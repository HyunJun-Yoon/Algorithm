package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem Link: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

class LeftRotation {
	 public static List<Integer> rotLeft(List<Integer> a, int d) {
		 	Integer[] arr = new Integer[a.size()];
		 	for(int i = 0; i < a.size(); i++) arr[i] = a.get(i);
		 	
		 	for(int i = 0; i < d; i++) {
		 		int tmp = arr[0];
		 		for(int j = 0; j < arr.length - 1; j++) {
		 			arr[j] = arr[j+1];
		 		}
		 		arr[arr.length-1] = tmp;
		 	}
		 	
		 	List<Integer> result =  Arrays.asList(arr);
		 	
		 	return result;
		    }
}

public class Hackerrank_Arrays_LeftRotation {

	public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> result = LeftRotation.rotLeft(a, d);


        bufferedReader.close();
	}

}
