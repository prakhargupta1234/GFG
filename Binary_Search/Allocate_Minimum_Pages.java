package Binary_Search;

public class Allocate_Minimum_Pages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int findPages(int[] arr, int k) {
	        // code here
	        if(k>arr.length) return -1;
	        int max=-1;
	        int sum =0;
	        for(int i=0;i<arr.length;i++){
	            max= Math.max(max, arr[i]);
	            sum+= arr[i];
	        }
	        int l=max;
	        int n = arr.length;
	        int h = sum;
	        int ans=-1;
	        while(l<=h){
	            int mid= (l+h)/2;
	            if(isitPossible(arr, k, mid )){
	                ans= mid;
	                h= mid-1;
	            }else{
	                l= mid+1;
	            }
	        }
	        return ans;
	        
	    }
	    
	    boolean isitPossible(int [] arr, int k, int mid){
	        int totalpage= 0;
	        int c=1;
	        for(int i=0;i<arr.length;i++){
	            if(totalpage+arr[i]<=mid){
	                totalpage+= arr[i];
	            }else{
	                c++;
	                totalpage= arr[i];
	            }
	            
	            if(c>k){
	                return false;
	            }
	        }
	        return c<=k;
	        
	    }
}
