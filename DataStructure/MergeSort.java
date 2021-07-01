package dataStructure;

public class MergeSort {

	public static void main(String[] args) {
		 int[] a = new int[4];
	        a[0] = 3;
	        a[1] = 1;
	        a[2] = 5;
	        a[3] = 4;

	        mergeSort(a, 0, 3);

	        for(int A : a)
	            System.out.print(A + " ");

	}
	   private static void mergeSort(int[] a, int left, int right) {

	        if(left < right) {
	            int mid = (left + right) / 2;
	            mergeSort(a,left,mid);
	            mergeSort(a,mid+1,right);

	            merge(a,left,mid,right);
	        }
	    }

	    private static void merge(int[] a, int left, int mid, int right) {

	        int lidx = left;
	        int ridx = mid+1;
	        int[] b = new int[a.length];
	        int bidx = left;

	        while(lidx <= mid && ridx <= right) {

	            if(a[lidx] <= a[ridx]){
	                b[bidx] = a[lidx];
	                lidx += 1; bidx +=1;
	            }
	            else {
	                b[bidx] = a[ridx];
	                ridx += 1; bidx +=1;
	            }
	        }

	        if(lidx > mid) {
	            for(int i = ridx; i<= right; ++i,++bidx)
	                b[bidx] = a[i];
	        }
	        else {
	            for(int i = lidx; i<= mid; ++i, ++bidx)
	                b[bidx] = a[i];
	        }
	        for(int i=left; i<=right; ++i)
	            a[i] = b[i];
	    }


}
