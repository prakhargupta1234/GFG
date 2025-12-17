package Binary_Search;

import java.util.Arrays;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 public int aggressiveCows(int[] stall, int k) {
	        Arrays.sort(stall);
	        int l= 1;
	        int h= stall[stall.length-1]- stall[0];
	        int n = stall.length;
	        int ans= -1;
	        while(l<=h){
	            int mid= (l+h)/2;
	            if(isitPossible(stall, k, mid)){
	               ans= mid;
	               l= mid+1;
	            }else{
	                h= mid-1;
	            }
	        }
	        return ans;
	        
	    }
	    
	    boolean isitPossible(int[] arr, int k, int mid){
	        int c=1;
	        int start= arr[0];
	        for(int i=1;i< arr.length;i++){
	            if(arr[i]- start>=mid){
	                c++;
	                start= arr[i];
	            }
	        }
	        return c>=k;
	    }

}
