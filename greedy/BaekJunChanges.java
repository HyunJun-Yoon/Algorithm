package practice;

import java.util.Scanner;

public class BaekJunChanges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 1000;
		int price = sc.nextInt();
		int[] arr = {500, 100, 50, 10, 5, 1};
		int changes = money - price;
		int count = 0;
		

		System.out.println(changes);
		
		while(changes != 0) {
			if(changes >= arr[0]) {
				changes -= arr[0];
				count++;
			}else if(changes >= arr[1]) {
				count += changes/arr[1];
				changes -= arr[1] * (changes/arr[1]);

			}else if(changes >= arr[2]) {
				count += changes/arr[2];
				changes -= arr[2]*(changes/arr[2]);
			}else if(changes >= arr[3]) {
				count += changes/arr[3];
				changes -= arr[3]*(changes/arr[3]);
			}else if(changes >= arr[4]) {
				count += changes/arr[4];
				changes -= arr[4]*(changes/arr[4]);
			}else {
				count += changes/arr[5];
				changes -= arr[5]*(changes/arr[5]);
			}
		}
		
		System.out.println(count);
		

	}

}
