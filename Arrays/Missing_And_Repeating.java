package Arrays;

import java.util.ArrayList;

public class Missing_And_Repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2};
		System.out.println(findTwoElement(arr));
	}

	public static ArrayList<Integer> findTwoElement(int arr[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		int n = arr.length;
		int repeating = -1, missing = -1;

		for (int i = 0; i < n; i++) {
			int idx = Math.abs(arr[i]) - 1;

			if (arr[idx] < 0) {
				repeating = Math.abs(arr[i]);
			} else {
				arr[idx] = -arr[idx];
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				missing = i + 1;
				break;
			}
		}

		ans.add(repeating);
		ans.add(missing);
		return ans;
	}
}
