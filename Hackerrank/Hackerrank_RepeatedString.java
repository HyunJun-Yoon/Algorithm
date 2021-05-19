package practice;

import java.io.*;


class repeatedString {
	
	 /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	long d = n / s.length();
    	int r  = (int)(n % s.length());
    	long result = 0;
    	
    	for(char c : s.toCharArray()) {
    		if (c == 'a') {
    			result++;
    		}
    	}
    	
    	result = result * d;
    	
    	if(r == 0) {
    		return result;
    	} else {
    		String part = s.substring(0, r);
    		for(char c : part.toCharArray()) {
    			if( c == 'a') {
    				result++;
    			}
    		}
    	}
    	
    	return result;
    	
//    	 if(n >= Math.pow(10, 12) ) {
//             return n;
//         }
//        
//    	 
//    	 char[] arr = new char[(int) n];
//    	 char[] str = new char[s.length()];
//    	 int result = 0;
//    	 
//    	 for(int i = 0; i < s.length(); i++) {
//    		 str[i] = s.charAt(i);
//    	 }
//    	 
//    	 int i = 0;
//    	 while(i < arr.length) {
//    		 for(int j = 0; j < str.length; j++) {
//	    		if(i < arr.length) {
//	    			arr[i] = str[j];
//	    			i++;
//    			}
//    		 }
//    	 }
//    	  for (char c : arr) {
//              if(c == 'a') {
//            	  result++;
//              }
//          }
//    	
//    	 return result;
    }
	
}

public class Hackerrank_RepeatedString {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = repeatedString.repeatedString(s, n);
        System.out.println(result);

        bufferedReader.close();

    }
}
