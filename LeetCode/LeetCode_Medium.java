package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeetCode_Medium {

	public static void main(String[] args) throws Exception, IOException {
		// Longest Substring Without Repeating Characters
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        
        char[] ch = new char[str.length()];
        char[] arr = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        
        int i = 1;
        int currentPosition = 1;
        int checkPosition = 0;
        int result = 0;
        int previousResult = 1;


        arr[0] = ch[0];
        
        while(i < ch.length) {
        	int j = checkPosition;
        	for(;j < currentPosition; j++) {
        		if(arr[j] == ch[i]) { 	
    
        			checkPosition++;     
        			result = (currentPosition+1) - checkPosition;
        			System.out.println("RESULT = " + result);
        			if(previousResult <= result) {
        				previousResult = result;
        			}
        			if(arr[checkPosition] == ch[i]) {
        				checkPosition++;
        			}
        			if(j+1 == i) {
        				checkPosition = i;
        			}
        			
        		}
        	}
        	arr[currentPosition] = ch[i];
        	i++;
        	currentPosition++;
        }
        
        if(result < currentPosition-checkPosition) {
        	int j = checkPosition;
        	boolean a = true;
        	for(; j < currentPosition; j++) {
        		for (int b = j + 1 ; b < currentPosition; b++) {
        			if (arr[j] == (arr[b])) { 
        				a = false;
        			}
        		}
        	}
        	if(a) {
        		result = currentPosition-checkPosition;
        	}       	
        }
        if(previousResult >= result) {
        	System.out.println(previousResult);
        }else {
        	System.out.println(result);
       }
        
	}

}

//
//class Solution {
//    public int lengthOfLongestSubstring(String str) {
//        
//        if (str == null || str.length() == 0) {
//            return 0;
//        }
//        
//        
//        char[] ch = new char[str.length()];
//        char[] arr = new char[str.length()];
//        
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//        
//        int i = 1;
//        int currentPosition = 1;
//        int previousResult = 0;
//        int result = 1;
//        arr[0] = ch[0];
//        
//          while(i < ch.length) {
//        	for(int j = 0; j < currentPosition; j++) {
//        		if(ch[i] == arr[j]) {
//        			if(previousResult <= result) {
//        				previousResult = result;
//        			}
//        			currentPosition = 0;
//        			result = 0;
//        			arr[currentPosition] = ch[i-1];
//        			currentPosition++;
//        			if(ch[i-1] != ch[i]) {
//        				arr[currentPosition] = ch[i];
//            			currentPosition++;
//            			result++;
//        			}
//        			
//        			break;
//        		}
//        	}
//        	if(result == 0) {
//        		result++;    		
//        		i++;
//        	}else {
//        		arr[currentPosition] = ch[i];
//            	result++;
//            	currentPosition++;
//            	i++;
//        	}
//        	
//        }
//        
//        
//        if(previousResult >= result) {
//        	return (previousResult);
//        }else {
//        	return (result);
//        }
//    }
//}