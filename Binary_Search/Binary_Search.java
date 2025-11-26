package Binary_Search;

public class Binary_Search {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
	}
	
	public int binarysearch(int[] arr, int k) {
        // Code Here
        int min=-1;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==k){
                min = mid;
                h= mid-1;
            }else if(arr[mid]<k){
                l= mid+1;
            }else{
                h= mid-1;
            }
        }
        return min;
        
    }
}
