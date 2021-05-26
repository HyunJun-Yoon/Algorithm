package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Problem Link: https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

class NewYearChaos {
	
	private static void swap(List<Integer> q, int a, int b) {
		int tmp = q.get(a);
		q.set(a, q.get(b));
		q.set(b, tmp);
	}
	
	public static void minimumBribes(List<Integer> q) {
		int result = 0;
		int gap = 0;
		
		for(int i = q.size()-1; i >= 0; i--) {
			if(q.get(i) != i+1) {
				if(((i-1) >= 0) && q.get(i-1) == (i+1)){
					result++;
					swap(q, i, i-1);
				} else if(((i-2) >= 0) && q.get(i-2) == (i+1)) {
					result += 2;
					swap(q, i - 2, i - 1);
					swap(q, i - 1, i);
				} else {
					System.out.println("Too chaotic");
					return;
				}
			} 
		}

		System.out.println(result);

	    }
	
}

public class Hackerrank_NewYearChaos {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            NewYearChaos.minimumBribes(q);
        }

        bufferedReader.close();

	}

}
