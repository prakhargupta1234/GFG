package Arrays;

public class Merge_With_Extra_Space {

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
	        int n = a.length;
	        int m = b.length;
	        int[] arr= new  int[n+m];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<n&& j<m){
	            if(a[i]<b[j]){
	                arr[k]= a[i];
	                k++;
	                i++;
	            }else{
	                arr[k]=b[j];
	                k++;
	                j++;
	            }
	        }
	        
	        while(i<n){
	            arr[k]= a[i];
	            i++;
	            k++;
	        }
	        
	        while(j<m){
	            arr[k]= b[j];
	            j++;
	            k++;
	        }
	        int idx=0;
	        for(int l=0;l<arr.length;l++){
	            if(l<n){
	                a[l]= arr[l];
	            }else{
	                b[l-n]= arr[l];
	            }
	        }
	    }

}
