package practice;


import java.io.*;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ArrManipulation {

    /*
		Problem Link: https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    	int size = queries.size();
        long[] arr = new long[n];
        long max = 0;
        Arrays.fill(arr, 0);
        
        for(int i = 0; i < size; i++) {
            int a = queries.get(i).get(0)-1;
            int b = queries.get(i).get(1)-1;
            int val = queries.get(i).get(2);
            arr[a] += val;
            if(b+1 < n) arr[b+1] -= val;
        }
        
        for(int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
        return max;
    }
}

public class Hackerrank_ArrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = ArrManipulation.arrayManipulation(n, queries);

        bufferedReader.close();

    }
}