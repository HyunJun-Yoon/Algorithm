package practice;

import java.util.Scanner;

public class BaekJunCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
        	a[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int tmp = 0;
        int R = 1;
        int result = 0;

        
        while(R != 0){
        	tmp = M/a[0];
        	for(int i = 1; i < N; i++) {
        		if(M/a[i] != 0 && M/a[i+1] == 0 && tmp > M/a[i]) {
            		tmp = M/a[i];
            		result += tmp;
            		R = M%a[i];
            		M = R;
        		}
        	}
        
        }
        System.out.println(result);
        
        
//        ANSWER ***
//        for(int i = N-1; i>=0; i--){
//            if(M>=arr[i]){
//                count += M/arr[i];
//                M = M%arr[i];
//            }
//            
//        }
        
	}

}
