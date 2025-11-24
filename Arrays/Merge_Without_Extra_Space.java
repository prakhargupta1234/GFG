package Arrays;

import java.util.Arrays;

public class Merge_Without_Extra_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,5,7};
		int[] arr2= {0,2,6,8,9};
		mergeArrays(arr1, arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}

	}
	 public static void mergeArrays(int a[], int b[]) {
	        // code here
	        int n = a.length-1;
	        int m = b.length;
	        int idx=0;
	        
	        while(n>=0&& idx<m){
	            if(a[n]>b[idx]){
	                int temp= a[n];
	                a[n]= b[idx];
	                b[idx]= temp;
	                n--;
	                idx++;
	            }else{
	                break;
	            }
	        }
	        Arrays.sort(a);
	        Arrays.sort(b);
	    }

}
