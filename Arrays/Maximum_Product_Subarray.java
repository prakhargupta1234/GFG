package Arrays;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		int[] arr= {2,3,-2,4};
		System.out.println(maxProduct(arr));
	}
	 public static int maxProduct(int[] arr) {
	        // code here
	        int pref=1;
	        int suff=1;
	        int ans=Integer.MIN_VALUE;
	        int n = arr.length;
	        for(int i=0;i<n;i++){
	            if(pref==0){
	                pref=1;
	            }
	            if(suff==0){
	            
	                suff=1;
	            }
	            pref= pref*arr[i];
	            suff=suff*arr[n-i-1];
	            ans=Math.max(ans,Math.max(pref,suff));
	        }
	        return ans;
	    }
}
