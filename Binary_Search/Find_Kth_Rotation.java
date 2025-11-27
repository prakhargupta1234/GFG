package Binary_Search;

public class Find_Kth_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findKRotation(int arr[]) {
        // Code here
        int ans= Integer.MAX_VALUE;
        int idx=-1;
        int l=0;
        int h= arr.length-1;
        while(l<=h){
            int mid= l+(h-l)/2;
            if(arr[l]<=arr[mid]){
                if(arr[l]<ans){
                    ans= Math.min(arr[l], ans);
                    idx=l;
                }
                l= mid+1;
            }else{
               if(arr[mid]<ans){
                    ans= Math.min(arr[mid], ans);
                    idx=mid;
                }
                h= mid-1;
            }
        }
        return idx;
        
    }

}
