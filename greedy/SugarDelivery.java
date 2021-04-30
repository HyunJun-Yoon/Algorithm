package practice;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b5 = n / 5;
		int r = n % 5;
		if(r == 0) {
			System.out.println(b5);
		}else if(r == 1 && b5 >= 1) {
			System.out.println(b5 - 1 + 2);
		}else if(r == 2 && b5 >= 2) {
			System.out.println(b5 - 2 + 4);
		}else if(r == 3) {
			System.out.println(b5 + 1);
		}else if(r == 4 && b5 >= 1) {
			System.out.println(b5 - 1 + 3);
		}
	}
}
		
//		int a = 3;
//		int b = 5;
//		int breaker = 0;
//		int result = 0;
//		int c = 0;
//
//		while(breaker == 0) {
//			if( N%a == 0 || N%b == 0) {
//				if(N%b == 0) {
//					result = N/b;
//					breaker = -1;
//				}
//				c = N%b;
//				if(c%a == 0) {
//					result = N/b + c/a;
//					breaker = -1;
//				}else if(N%a == 0) {
//					int d = 0;
//					c = N%b;
//					if(c < a) {
//						c = (N/b)-1;
//						d = N-(c*b);
//						if(d%a == 0) {
//							result = c + d/a;
//							breaker = -1;
//						}else {
//							result = N/a;
//							breaker = -1;
//						}
//					}else {
//						result = N/a;
//						breaker = -1;
//					}
//				}
//			}else if(N%a != 0 && N%b != 0){
//				c = N%a;
//				if(c == b-a) {
//					result = ((N/a)-1) + (c+a)/b;
//					breaker = -1;
//				}
//				c = N%b;
//				if(c%a == 0) {
//					result = N/b + c/a;
//					breaker = -1;
//				}
//			}else {
//				result = -1;
//				breaker = -1;
//			}
//		}
//		System.out.println(result);
//
//	}


