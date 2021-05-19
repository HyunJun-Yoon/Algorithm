package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJun10162 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int a,b,c;
  
        
        if(300 <= t) {
        	a = t/300;
        	t = t%300;
        }else {
        	a = 0;
        }
        if(t != 0 && 60 <= t) {
        	b = t/60;
        	t = t%60;
        }else {
        	b = 0;
        }
        
        if(t != 0 && 10 <= t) {
        	c = t/10;
        	t = t%10;
        }else {
        	c = 0;
        }
        
        if(t == 0) {
        	System.out.println(a + " " + b + " " + c);
        }else {
        	System.out.println(-1);
        }
	}

}
