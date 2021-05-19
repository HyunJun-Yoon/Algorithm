package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJunClassRoom {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[][] arr = new int[n][2];

      for (int i = 0; i <n ; i++) {
          arr[i][0]=sc.nextInt();
          arr[i][1]=sc.nextInt();
      }
      Arrays.sort(arr, new Comparator<int[]>() {
          @Override
          public int compare(int[] start, int[] end) {
        	  // start[0] = [1][0], start[1] = [1][1] end[0] = [0][0], end[1] = [0][1] at once
        	  System.out.println("0: " + start[0] + end[0]);
        	  System.out.println("1: " + start[1] + end[1]);
              if(start[1] == end[1]){
                  //if time of end and start are same sort with starting time
            	  System.out.println(Integer.compare(start[0], end[0]));
                  return Integer.compare(start[0], end[0]);
              }

              return Integer.compare(start[1], end[1]);
          }
      });
      
      int count =0;
      int end = -1;
      for (int i = 0; i <n ; i++) {
          if(arr[i][0] >= end){
              end = arr[i][1];
              count++;
          }
      }

      System.out.println(count);
		
		
		
//		Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        int[] s = new int[t];
//        int[] e = new int[t];
//        int min = 0;
//		int tmp = 0;
//		int p = 0;
//		int result = 1;
//        
//	    
//        for(int i = 0; i< t; i++){
//            s[i] = scanner.nextInt();
//            e[i] = scanner.nextInt();
//        }
//        
//        for(int i = 0; i < e.length-1; i++) {
//			min = i;
//			for(int j = i+1; j < e.length; j++) {
//				if(e[min] > e[j]) {
//					min = j;
//				}
//			}
//			tmp = e[min];
//			e[min] = e[i];
//			e[i] = tmp;
//			
//			tmp = s[min];
//			s[min] = s[i];
//			s[i] = tmp;
//		}
//        
//        for(int i = 0; i < t; i++) {
//        	if(e[p] <= s[i]) {
//        		result++;
//        		p = i;
//        	}
//        }
//        System.out.println(result);
	}
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[][] arr = new int[n][2];
//
//        for (int i = 0; i <n ; i++) {
//            arr[i][0]=sc.nextInt();
//            arr[i][1]=sc.nextInt();
//        }
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] start, int[] end) {
//                if(start[1] == end[1]){
//                    return Integer.compare(start[0], end[0]);
//                }
//
//                return Integer.compare(start[1], end[1]);
//            }
//        });
//        
//        int count =0;
//        int end = -1;
//        for (int i = 0; i <n ; i++) {
//            if(arr[i][0] >= end){
//                end = arr[i][1];
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//}

	}

