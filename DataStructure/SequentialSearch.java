package dataStructure;

import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] dataArray = { 7, 14, 2, 10, 11, 16 };

        System.out.println("Enter the data you want to search");
        Scanner scan = new Scanner(System.in); 
        int search = Integer.parseInt(scan.nextLine().trim()); 
      
        int result = sequentialSearch(dataArray, search);


        if(result == -1)
            System.out.println("Data not Found");
        else
            System.out.println("Located: " + result);
    }

    public static int sequentialSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == search) 
                return i;
        }
        return -1;
    }

}


